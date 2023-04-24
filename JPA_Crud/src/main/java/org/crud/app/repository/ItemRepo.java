package org.crud.app.repository;

import org.crud.app.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemModel, Integer> {

}
