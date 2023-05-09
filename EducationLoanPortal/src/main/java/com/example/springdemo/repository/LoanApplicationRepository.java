package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel,Integer>{

}