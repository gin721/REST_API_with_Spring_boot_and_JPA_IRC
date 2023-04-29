package org.crud.app.repository;

import java.util.UUID;
import java.util.List;

import org.crud.app.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepo extends JpaRepository<ItemModel, UUID> {
	//public List<ItemModel> findByItemName(String itemName);
	//public List<ItemModel> findByQuantity(Integer quantity);
	
	@Query(value = "SELECT * FROM item_model", nativeQuery = true)
	public List<ItemModel> getAllData();
	
}
