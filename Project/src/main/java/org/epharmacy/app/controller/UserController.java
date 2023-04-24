package org.epharmacy.app.controller;

import java.util.List;
import java.util.Optional;

import org.epharmacy.app.model.UserModel;
import org.epharmacy.app.service.UserService;
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
public class UserController {
	
	@Autowired
	public UserService service;
	
	@PostMapping(value="/users/saveUser")
	public UserModel addUser(@RequestBody UserModel user)
	{
		return service.saveUser(user);
	}
	
	@GetMapping(value = "/users/getUser/{user_id}")
	public Optional<UserModel> getUser(@PathVariable long user_id)
	{
		return service.getUser(user_id);
		
	}
	
	@GetMapping(value = "/users/getUser")
	public Optional<UserModel> getUserByReqParam(@RequestParam long user_id)
	{
		return service.getUser(user_id);
	}
	
	@GetMapping(value = "/users/getUsers")
	public List<UserModel> getAllUsers()
	{
		return service.getUsers();
	}
	
	@PutMapping(value = "/users/updateUser")
	public UserModel updateUserById(@RequestBody UserModel user_id)
	{
		return service.updateUser(user_id);
	}
	
	@DeleteMapping(value = "/users/deleteUser/{user_id}")
	public String deleteUser(@PathVariable long user_id)
	{
		service.deleteUser(user_id);
		return "Drug with ID " + user_id + " is deleted"; 
	}
	
	@DeleteMapping(value = "/users/deleteUser")
	public String deleteUserByReqParam(@RequestParam long user_id)
	{
		service.deleteUser(user_id);
		return "Drug with ID " + user_id + " is deleted"; 
	}
}
