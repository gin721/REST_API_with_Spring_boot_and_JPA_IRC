package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info=@Info(
				title="Loan Database",
				version="1.1.2",
				description="Loan Details and Project",
				contact=@Contact(
						name="Sanjay",
						email="ssanjay80023@gmail.com"
						)
				)	
		)
@SpringBootApplication
public class EducationLoanPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationLoanPortalApplication.class, args);
		System.out.println("Run Sucessfully");
	}

}