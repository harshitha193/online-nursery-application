package com.sprint.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IPlantRepository;
import com.sprint.entities.Plant;
import com.sprint.service.IPlantService;

@Service
public class PlantServiceImpl implements  IPlantService{
@Autowired
IPlantRepository repository;

@Override
public Plant addPlant(Plant plant) {
return repository.save(plant);
}

@Override
public Plant updatePlant(Plant plant) {
Plant plants = repository.findById(plant.getPlantId()).orElseThrow(()->new EntityNotFoundException("No plant found for the given Id"));
plant.setPlantHeight(plant.getPlantHeight());
 return  repository.save(plants);
}

@Override
public void deletePlant(int plantId) {
 repository.deleteById(plantId);
}

@Override
public Plant viewPlant(int plantId) {
return repository.findById(plantId).get();
}

@Override
public List<Plant> viewPlant(String commonName) {
return repository.findByCommonName(commonName);
}

@Override
public List<Plant> viewAllPlants() {
return repository.findAll();
}

@Override
public List<Plant> viewAllPlants(String typeOfPlant) {
return repository.findByTypeOfPlant(typeOfPlant);
}




}