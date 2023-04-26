package org.crud.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
	
	@PostMapping(value = "/post")
	public ItemModel addDetails(@RequestBody ItemModel item){
		return service.saveData(item);
	}

	@PutMapping(value = "/put")
	public String updateDetails(@RequestBody ItemModel item, @RequestParam(value = "id") UUID id){
		return service.updateData(item, id);
	}
	
	@GetMapping(value = "/getAll")
	public List<ItemModel> getAllDetails(){
		return service.getAllData();
	}
	
	@GetMapping(value = "/get")
	public Optional<ItemModel> getDetail(@RequestParam(value = "id") UUID id){
		return service.getDataById(id);
	}
	
	@DeleteMapping(value = "/delete")
	public String deleteDetailReqparam(@RequestParam UUID id){
		return service.deleteData(id);
	}
	
	@DeleteMapping(value = "/deleteAll")
	public String deleteDetails(){
		return service.deleteAllData();
	}
	
	@GetMapping(value = "/sort/desc/{column_value}")
	public List<ItemModel> descendingOrder(@PathVariable(value = "column_value") String column_value){
		return service.sortDescending(column_value);
	}
	
	@GetMapping(value = "/sort/asc/{name}")
	public List<ItemModel> ascendingOrder(@PathVariable(value = "name") String name){
		return service.sortAscending(name);
	}
	
	@GetMapping(value = "/pagination/{pnu}/{psize}")
	public List<ItemModel> pagination(@PathVariable(value = "pnu") int pnu, @PathVariable(value = "psize") int psize){
		return service.pagination(pnu, psize);
	}
	
	@GetMapping(value = "/pands/{pnu}/{psize}/{column_value}")
	public List<ItemModel> paginationData(@PathVariable(value = "pnu") int pnu, @PathVariable(value = "psize") int psize, @PathVariable(value = "column_value") String column_value){
		return service.paginationAndSorting(pnu, psize, column_value);
	}
}
