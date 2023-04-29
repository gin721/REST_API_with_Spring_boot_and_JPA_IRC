package org.epharmacy.app.repository;

import java.util.UUID;

import org.epharmacy.app.model.DrugModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<DrugModel, UUID> {
	
}
