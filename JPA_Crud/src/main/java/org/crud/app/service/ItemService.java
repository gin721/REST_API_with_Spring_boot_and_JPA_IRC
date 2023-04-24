package org.crud.app.service;

import java.util.List;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	public ItemRepo repo;
	
	public ItemModel saveInfo(ItemModel i)
	{
		return repo.save(i);
	}

	public List<ItemModel> getAllInfo()
	{
		return repo.findAll();
	}
	
	public ItemModel updateInfo(ItemModel i)
	{
		return repo.save(i);
	}

	public String deleteInfo(int i)
	{
		repo.deleteById(i);
		return "ITEM WITH ID " + i + " IS DELETED SUCCESSFULLY";
	}
	

}
