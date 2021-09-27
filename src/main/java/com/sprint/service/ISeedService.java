package com.sprint.service;

import java.util.List;

import com.sprint.entities.Seed;

public interface ISeedService {
	 public Seed addSeed(Seed seed);
	    public Seed updateSeed(Seed seed);
	    public void deleteSeed(int seedId);
	    public Seed viewSeed(int seedId);
	    public Seed viewSeed(String commonName);
	    public List<Seed> viewAllSeeds();
	    public List<Seed> viewAllSeeds(String typeOfSeed);

}
