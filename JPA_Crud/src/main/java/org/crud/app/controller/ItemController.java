package org.crud.app.controller;

import java.util.List;

import org.crud.app.model.ItemModel;
import org.crud.app.service.ItemService;
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
public class ItemController {
	
	@Autowired
	public ItemService service;
	
	//Post Mapping controller to add the info into the db using the service logic class functions
	@PostMapping(value = "/saveInfo")
	public ItemModel addDetails(@RequestBody ItemModel item)
	{
		return service.saveInfo(item);
	}

	//Put Mapping controller to save or update and flush the details to db using service logic class functions
	@PutMapping(value = "/updateInfo/{id}")
	public ItemModel updateDetails(@PathVariable int id, @RequestBody ItemModel item)
	{
		return service.updateInfo(item);
	}
	
	//Get Mapping controller to get the details using service logic class functions
	@GetMapping(value = "/getInfo")
	public List<ItemModel> getAllDetails()
	{
		return service.getAllInfo();
	}
	
	//Delete mapping controller to delete the details using service logic functions
	//Path variable delete method
	@DeleteMapping(value = "/delete/{id}")
	public String deleteDetail(@PathVariable int id)
	{
		return service.deleteInfo(id);
	}
	
	//RequestParam delete method
	@DeleteMapping(value = "/delete")
	public String deleteDetailReqparam(@RequestParam int id)
	{
		return service.deleteInfo(id);
	}
}
