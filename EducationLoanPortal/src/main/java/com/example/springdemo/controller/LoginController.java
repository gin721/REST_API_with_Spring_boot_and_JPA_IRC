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

import com.example.springdemo.model.LoginModel;
import com.example.springdemo.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService ls;
	 @PostMapping("/login/save")
	 public LoginModel postD2(@RequestBody LoginModel amodel5)
	 {
	  return ls.post3(amodel5);
	 }
	 @GetMapping("/login/get")
	 public List<LoginModel> getD2()
	 {
	  return ls.get3();
	 }
	 @PutMapping("/login/put")
	 public LoginModel putD2(@RequestBody LoginModel amodel6)
	 {
	  return ls.put3(amodel6);
	 }
	 @DeleteMapping("/login/del/{apass}")
	 public String deleteD2(@PathVariable ("apass")String password)
	 {
	  ls.delete3(password);
	  return "Deleted";
	 }
	
}