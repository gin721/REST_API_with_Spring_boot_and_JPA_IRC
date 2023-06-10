package com.pharmacy.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.project.dto.LoginDTO;
import com.pharmacy.project.model.UserModel;
import com.pharmacy.project.payment.Message;
import com.pharmacy.project.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	public UserService service;
	
	@PostMapping("/login")
	public Message Login(@RequestBody LoginDTO user) {
		return service.loginUser(user);
	}

	@PostMapping("/signup")
	public Message SignUp(@RequestBody UserModel user) {
		return service.SignUpUser(user);
	}
}