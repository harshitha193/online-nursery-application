package com.sprint.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Plant;
@Repository
public interface IPlantRepository extends JpaRepository<Plant, Integer>{

	List<Plant> findByCommonName(String commonName);

	List<Plant> findByTypeOfPlant(String typeOfPlant);

	
}
