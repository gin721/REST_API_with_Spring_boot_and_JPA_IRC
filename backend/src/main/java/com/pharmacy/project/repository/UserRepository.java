package com.pharmacy.project.repository;

import java.util.Optional;

import com.pharmacy.project.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
	public Optional<UserModel> findOneByEmailAndPassword(String email, String password);
	UserModel findByEmail(String email);
}