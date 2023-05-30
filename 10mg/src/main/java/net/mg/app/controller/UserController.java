package net.mg.app.controller;

import net.mg.app.model.User;
import net.mg.app.service.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	public UserService service;
	
	@PostMapping(value = "/post")
	public boolean postData(@RequestBody User user){
		return service.saveData(user);
	}
	
	@PutMapping(value = "/put/{id}")
	public boolean putData(@RequestBody User user, @PathVariable(value = "id") int id){
		return service.updateData(user, id);
	}
	
	@GetMapping(value = "/get/{id}")
	public Optional<User> getData(@PathVariable(value = "id") int id){
		return service.fetchById(id);
	}
	
	@GetMapping(value = "/get")
	public List<User> getAllData(){
		return service.fetchAll();
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public boolean deleteData(@PathVariable(value = "id") int id) {
		return service.deleteData(id);
	}
}
