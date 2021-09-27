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


import com.sprint.entities.Seed;

import com.sprint.serviceImpl.SeedServiceImpl;

@RestController
@RequestMapping("/seed")
public class SeedController {
	@Autowired
	SeedServiceImpl seedService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Seed addSeed(@RequestBody Seed seed) {
		return seedService.addSeed(seed);
	}
	
	@PutMapping("/updateSeed")
	public Seed updateSeed(@RequestBody Seed seed) {
		return seedService.updateSeed(seed);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteSeed(@PathVariable int seedId) {
		 seedService.deleteSeed(seedId);
	}
	@GetMapping("/viewSeed/{id}")
	public Seed viewSeed(@PathVariable int seedId) {
		return seedService.viewSeed(seedId);
	}
	@GetMapping("/viewSeed/{commonName}")
	public Seed viewSeed(@PathVariable String commonName) {
		return seedService.viewSeed(commonName);
	}
	@GetMapping("/viewAllSeeds")
	public List<Seed> viewAllSeeds() {
		return seedService.viewAllSeeds();
	}
	@GetMapping("/viewAllSeeds/{typeOfSeeds}")
	public List<Seed> viewAllSeeds(@PathVariable String typeOfSeed){
		return seedService.viewAllSeeds(typeOfSeed);
	}
	
}
