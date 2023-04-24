package org.epharmacy.app.controller;

import java.util.List;
import java.util.Optional;

import org.epharmacy.app.model.DrugModel;
import org.epharmacy.app.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {
	
	@Autowired
	public DrugService service;
	
	@PostMapping(value="/drugs/saveDrug")
	public DrugModel addDrug(@RequestBody DrugModel drug)
	{
		return service.saveDrug(drug);
	}
	
	@GetMapping(value = "/drugs/getDrug/{drug_id}")
	public Optional<DrugModel> getDrug(@PathVariable long drug_id)
	{
		return service.getDrug(drug_id);
		
	}
	
	@GetMapping(value = "/drugs/getDrug")
	public Optional<DrugModel> getDrugByReqParam(@RequestParam long drug_id)
	{
		return service.getDrug(drug_id);
	}
	
	@GetMapping(value = "/drugs/getDrugs")
	public List<DrugModel> getAllDrug()
	{
		return service.getDrugs();
	}
	
	@PutMapping(value = "/drugs/updateDrug")
	public DrugModel updateDrugById(@RequestBody DrugModel drug)
	{
		return service.updateDrug(drug);
	}
	
	@DeleteMapping(value = "/drugs/deleteDrug/{drug_id}")
	public String deleteDrug(@PathVariable long drug_id)
	{
		service.deleteDrug(drug_id);
		return "Drug with ID " + drug_id + " is deleted"; 
	}
	
	@DeleteMapping(value = "/drugs/deleteDrug")
	public String deleteDrugByReqParam(@RequestParam long drug_id)
	{
		service.deleteDrug(drug_id);
		return "Drug with ID " + drug_id + " is deleted"; 
	}
}
