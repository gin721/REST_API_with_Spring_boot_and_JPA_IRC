package com.pharmacy.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info=@Info(
		title="10mg",
		version="1.1",
		description="A web platform to order medicines",
		contact=@Contact(
		name="Sachin",
		email="sachin7o2o1o@gmail.com"
		)
	)	
)
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
