package com.pharmacy.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.project.dto.LoginDTO;
import com.pharmacy.project.model.UserModel;
import com.pharmacy.project.payment.Message;
import com.pharmacy.project.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository repo;
	
	public Message loginUser(LoginDTO data) {
		UserModel user = repo.findByEmail(data.getEmail());
		
		if(user != null) {
			Optional<UserModel> details = repo.findOneByEmailAndPassword(data.getEmail(), data.getPassword());
			
			if(details.isPresent()) {
				return new Message("Login Successful", true);
			}
			else {
				return new Message("Login Failed : Password is incorrect", false);
			}
		}
		else {
			return new Message("Login Failed : Email does not exist", false);
		}
	}
	
	public Message SignUpUser(UserModel data) {
		UserModel user = repo.findByEmail(data.getEmail());
		if(user == null) {
			repo.save(data);
			
			return new Message("Account is created", true);
		}
		else{
			return new Message("Email already exist. Use Login", false);
		}
	}
}