package org.epharmacy.app.repository;

import java.util.UUID;

import org.epharmacy.app.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
	
	public boolean existsByUserNameAndPassword(String userName, String password);
}
