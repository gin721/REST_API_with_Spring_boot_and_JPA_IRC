package org.epharmacy.app.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.epharmacy.app.model.DrugModel;
import org.epharmacy.app.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class DrugService {
	
	@Autowired
	public DrugRepository repo;
	
	
	public String createDrug(DrugModel drug){
		boolean value = repo.existsById(drug.getDrugId());
	
		if(value == true){
			return "The user already exists. To enter the application please use login";
		}
		else{
			repo.save(drug);
			return "A new user with the details " + drug.toString() + " is created. Login to continue";
		}
	}
	
	
	public Optional<DrugModel> getDrug(UUID id){
		boolean value = repo.existsById(id);
		if(value == true) {
			return repo.findById(id);
		}
		else {
			return null;
		}
	}
	
	
	public List<DrugModel> getAllDrugs(){
		return repo.findAll();
	}
	
	
	public String updateDrug(DrugModel drug, UUID id){
		boolean value = repo.existsById(id);
		DrugModel dummy = repo.findById(id).orElse(null);
		if(value == true) {
			dummy.setDrugComp(drug.getDrugComp());
			dummy.setDrugDesc(drug.getDrugDesc());
			dummy.setDrugName(drug.getDrugName());
			dummy.setDrugQty(drug.getDrugQty());
			dummy.setDrugType(drug.getDrugType());
			dummy.setExpDate(drug.getExpDate());
			dummy.setImgUrl(drug.getImgUrl());
			dummy.setProdDate(drug.getProdDate());
			dummy.setSellPrice(drug.getSellPrice());
			
			repo.saveAndFlush(dummy);
			
			return "The drug details was successfully updated in the database";
		}
		else {
			return "The drug details is not present in the database to be updated";
		}
	}
	
	
	public String deleteDrug(UUID id){
		DrugModel value = repo.findById(id).orElse(null);
		if(value != null) {
			repo.deleteById(id);
			return "Drug with id " + id + "is not deleted from the database";
		}
		else {
			return "Drug with id " + id + "is not deleted as it's not present in Database";
		}
	}
	
	
	public List<DrugModel> sortAscending(String field){
		return repo.findAll(Sort.by(Direction.ASC, field));
	}
	
	
	public List<DrugModel> sortDescending(String field){
		return repo.findAll(Sort.by(Direction.DESC, field));
	}
	
	
	public List<DrugModel> paginationAndSorting(int pageNumber, int pageSize, String field){
		Page<DrugModel> drug = repo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Direction.ASC, field)));
		return drug.getContent();
	}
}
