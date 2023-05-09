package com.example.springdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel,String>
{
     void deleteByPassword(String password);
}