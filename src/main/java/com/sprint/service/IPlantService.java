package com.sprint.service;

import java.util.List;

import com.sprint.entities.Plant;

public interface IPlantService {
	public Plant addPlant(Plant plant);
    public Plant updatePlant(Plant plant);
    public void deletePlant(int plantId);
    public Plant viewPlant(int plantId);
    public List<Plant> viewPlant(String commonName);
    public List<Plant> viewAllPlants();
    public List<Plant> viewAllPlants(String typeOfPlant);

}
