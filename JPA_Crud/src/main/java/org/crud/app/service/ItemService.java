package org.crud.app.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


@Service
public class ItemService {
	
	@Autowired
	public ItemRepo repo;
	
	//Used to save a data into the database
	public ItemModel saveData(ItemModel i){
		return repo.save(i);
	}

	//Used to get all data from the database
	public List<ItemModel> getAllData(){
		return repo.findAll();
	}
	
	public Optional<ItemModel> getDataById( UUID id){
		return repo.findById(id);
	}
	
	//Used to update the data if present in database
	public ItemModel updateData(ItemModel i, UUID id){
		ItemModel item = repo.findById(id).orElse(null);
		if(item != null){
			item.setItemName(i.getItemName());
			item.setQuantity(i.getQuantity());
			return repo.saveAndFlush(item);			
		}
		else{
			return null;
		}
	}

	public String deleteData(UUID id){
		ItemModel item = repo.findById(id).orElse(null);
		if(item != null) {
			repo.deleteById(id);
			return "ITEM WITH ID " + id + " IS DELETED SUCCESSFULLY";
		}
		else {
			return "ITEM WITH ID " + id + " IS NOT FOUND IN THE DATABASE TO DELETE";
		}
	}
	
	public String deleteAllData()
	{
		repo.deleteAll();
		return "ALL DATA WAS DELETED IN THE DATABASE";
	}
	
	public List<ItemModel> sortDescending(String field){	
		return repo.findAll(Sort.by(Direction.DESC, field));
	}
	
	public List<ItemModel> sortAscending(String field){	
		return repo.findAll(Sort.by(Direction.ASC, field));
	}

	public List<ItemModel> pagination(int pageNumber, int pageSize){
		Page<ItemModel> i = repo.findAll(PageRequest.of(pageNumber, pageSize));
		return i.getContent();
	}
	
	public List<ItemModel> paginationAndSorting(int pageNumber, int pageSize, String column_name){
		Page<ItemModel> i = repo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(column_name).descending()));
		return i.getContent();
	}
}
