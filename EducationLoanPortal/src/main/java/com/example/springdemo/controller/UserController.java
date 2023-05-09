package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.UserModel;
import com.example.springdemo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	 @PostMapping("/user/save")
	 public UserModel postD3(@RequestBody UserModel amodel7)
	 {
	  return us.post4(amodel7);
	 }
	 @GetMapping("/user/get")
	 public List<UserModel> getD3()
	 {
	  return us.get4();
	 }
	 @PutMapping("/user/update")
	 public UserModel putD3(@RequestBody UserModel amodel8)
	 {
	  return us.put4(amodel8);
	 }
	 @DeleteMapping("/user/del/{id}")
	 public String deleteD3(@PathVariable("id") int id)
	 {
	  us.delete4(id);
	  return "Deleted";
	 }
	}