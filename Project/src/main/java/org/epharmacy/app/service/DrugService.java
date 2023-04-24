package org.epharmacy.app.service;

import java.util.List;
import java.util.Optional;

import org.epharmacy.app.model.DrugModel;
import org.epharmacy.app.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugService {
	
	@Autowired
	public DrugRepository repo;
	
	public DrugModel saveDrug(DrugModel d)
	{
		return repo.save(d);
	}
	
	public Optional<DrugModel> getDrug(long id)
	{
		return repo.findById(id);
	}
	
	public List<DrugModel> getDrugs()
	{
		return repo.findAll();
	}
	
	public DrugModel updateDrug(DrugModel d)
	{
		return repo.save(d);
	}
	
	public void deleteDrug(long id)
	{
		repo.deleteById(id);
	}
}
