package com.example.springdemo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.AdminModel;
import com.example.springdemo.repository.AdminRepository;

import jakarta.transaction.Transactional;
@Service
public class AdminService {
    @Autowired
    AdminRepository ar; 
	 public AdminModel post1(AdminModel amodel)
     {
      return ar.save(amodel);
     }
     
     public List<AdminModel> get1()
     {
      return ar.findAll();
     }
     
     public AdminModel put1(AdminModel amodel1)
     {
      return ar.saveAndFlush(amodel1);
     }
     @Transactional
     public void delete1(String password)
     {
      ar.deleteByPassword(password);
     }
}