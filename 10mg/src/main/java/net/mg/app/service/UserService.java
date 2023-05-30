package net.mg.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mg.app.model.User;
import net.mg.app.repository.UserRepository;

@Service
public class UserService {
	 
	@Autowired
	public UserRepository repo;
	
	public List<User> fetchAll(){
		return repo.findAll();
	}
	
	public boolean saveData(User user) {
		User u = repo.findById(user.getId()).orElse(null);
		
		if(u != null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Optional<User> fetchById(int id){
		return repo.findById(id);
	}
	
	public boolean updateData(User u, int id){
		User user = repo.findById(id).orElse(null);
		
		if(user != null) {
			
			user.setFirst_name(u.getFirst_name());
			user.setLast_name(u.getLast_name());
			
			return true;			
		}
		else {
			return false;
		}
	}
	
	public boolean deleteData(int id) {
		User user = repo.findById(id).orElse(null);
		if(user != null){
			repo.delete(user);
			return true;
		}
		else {
			return false;
		}
	}
}
