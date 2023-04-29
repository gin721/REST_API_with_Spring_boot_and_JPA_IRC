package org.epharmacy.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.epharmacy.app.model.DrugModel;
import org.epharmacy.app.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "drug")
public class DrugController {
	
	@Autowired
	public DrugService service;
	
	
	//Post Drug
	@PostMapping(value="/createDrug")
	public String addDrug(@RequestBody DrugModel drug){
		return service.createDrug(drug);
	}
	
	
	//Get Drug by Id
	@GetMapping(value = "/getDrug")
	public Optional<DrugModel> getDrug(@RequestParam(required = true) UUID drug_id){
		return service.getDrug(drug_id);
	}
	
	
	//Get All Drug
	@GetMapping(value = "/getDrugs")
	public List<DrugModel> getAllDrug(){
		return service.getAllDrugs();
	}
	
	
	//Edit Drug
	@PutMapping(value = "/editDrug")
	public String updateDrugById(@RequestBody DrugModel drug, @RequestParam(required = true) UUID id){
		return service.updateDrug(drug, id);
	}
	
	
	//Delete Drug
	@DeleteMapping(value = "/deleteDrug")
	public String deleteDrugByReqParam(@RequestParam UUID drug_id){
		return service.deleteDrug(drug_id); 
	}
	
	
	//Ascending Sorting
	@GetMapping(value = "/sortAsc")
	public List<DrugModel> sortAsc(@RequestParam(required = true) String field){
		return service. sortAscending(field);
	}
		
		
	//Descending Sorting
	@GetMapping(value = "/sortDesc")
	public List<DrugModel> sortDesc(@RequestParam(required = true) String field){
		return service. sortDescending(field);
	}
	
	
	//Pagination with sorting
	@GetMapping(value = "/pagination")
	public List<DrugModel> paginationData(@RequestParam(value = "pnu", required = true) int pnu, @RequestParam(value = "psize", required = true) int psize, @RequestParam(value = "field", required = true) String field){
		return service.paginationAndSorting(pnu, psize, field);
	}
}
