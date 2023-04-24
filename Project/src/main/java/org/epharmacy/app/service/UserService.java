package org.epharmacy.app.service;

import java.util.List;
import java.util.Optional;

import org.epharmacy.app.model.UserModel;
import org.epharmacy.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	public UserRepository repo;
	
	public UserModel saveUser(UserModel user)
	{
		return repo.save(user);
	}
	
	public Optional<UserModel> getUser(long id)
	{
		return repo.findById(id);
	}
	
	public List<UserModel> getUsers()
	{
		return repo.findAll();
	}
	
	public UserModel updateUser(UserModel user)
	{
		return repo.saveAndFlush(user);
	}

	public String deleteUser(long i)
	{
		repo.deleteById(i);
		return "ITEM WITH ID " + i + " IS DELETED SUCCESSFULLY";
	}
}
