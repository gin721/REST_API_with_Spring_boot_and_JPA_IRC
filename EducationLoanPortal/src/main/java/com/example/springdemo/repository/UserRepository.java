package com.example.springdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{

}