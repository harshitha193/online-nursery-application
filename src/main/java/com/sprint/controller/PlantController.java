package com.sprint.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.sprint.entities.Plant;

import com.sprint.serviceImpl.PlantServiceImpl;

@RestController
@RequestMapping("/plant")
public class PlantController {
	@Autowired
	PlantServiceImpl plantService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Plant addPlant(@RequestBody Plant plant) {
		return plantService.addPlant(plant);
	}

	@PutMapping("/updatePlant")
	public Plant updatePlant(@RequestBody Plant plant) {
		return plantService.updatePlant(plant);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePlant(@PathVariable("id") int plantId) {
		plantService.deletePlant(plantId);
	}

	@GetMapping("/viewPlant/{id}")
	public Plant viewPlant(@PathVariable int plantId) {
		return plantService.viewPlant(plantId);
	}

	@GetMapping("/viewPlant/{commonName}")
	public List<Plant> viewPlant(@PathVariable String commonName) {
		return plantService.viewPlant(commonName);
	}

	@GetMapping("/viewAllPlants")
	public List<Plant> viewAllPlants() {
		return plantService.viewAllPlants();
	}

	@GetMapping("/viewAllPlants/{typeOfPlant}")
	public List<Plant> viewAllPlants(@PathVariable String typeOfPlant) {
		return plantService.viewAllPlants(typeOfPlant);
	}

}
