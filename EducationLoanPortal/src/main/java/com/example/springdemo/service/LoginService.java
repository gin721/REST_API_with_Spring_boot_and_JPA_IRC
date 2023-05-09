package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.LoginModel;
import com.example.springdemo.repository.LoginRepository;

import jakarta.transaction.Transactional;
@Service
public class LoginService {
	
	@Autowired
	     LoginRepository lr;
	     public LoginModel post3(LoginModel amodel4)
	     {
	      return lr.save(amodel4);
	     }
	     
	     public List<LoginModel> get3()
	     {
	      return lr.findAll();
	     }
	     
	     public LoginModel put3(LoginModel amodel5)
	     {
	      return lr.saveAndFlush(amodel5);
	     }
	     @Transactional
	     public void delete3(String password)
	     {
	      lr.deleteByPassword(password);
	     
      }
}