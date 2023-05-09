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

import com.example.springdemo.model.AdminModel;
import com.example.springdemo.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService as;
	@PostMapping("/admin/post")
	 public AdminModel postD(@RequestBody AdminModel amodel)
	 {
	  return as.post1(amodel);
	 }
	 @GetMapping("/admin/get")
	 public List<AdminModel> getD()
	 {
	  return as.get1();
	 }
	 @PutMapping("/admin/editdetails")
	 public AdminModel putD(@RequestBody AdminModel amodel1)
	 {
	  return as.put1(amodel1);
	 }
	 @DeleteMapping("/admin/del/{pass}")
	 public String deleteD(@PathVariable("pass") String password)
	 {
	  as.delete1(password);
	  return "Deleted";
	 }
}