package com.example.springdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel,String> {
	void deleteByPassword(String password);
}