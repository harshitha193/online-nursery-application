package com.sprint.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.ISeedRepository;
import com.sprint.entities.Seed;
import com.sprint.service.ISeedService;

@Service
public class SeedServiceImpl implements ISeedService {
	@Autowired
	ISeedRepository repository;

	@Override
	public Seed addSeed(Seed seed) {
		return repository.save(seed);
	}

	@Override
	public Seed updateSeed(Seed seed) {
		Seed seeds = repository.findById(seed.getSeedId())
				.orElseThrow(() -> new EntityNotFoundException("No seed found for the given Id"));
		seeds.setTypeOfSeeds(seed.getTypeOfSeeds());
		return repository.save(seeds);
	}

	@Override
	public void deleteSeed(int seedId) {
		repository.deleteById(seedId);
	}

	@Override
	public Seed viewSeed(int seedId) {
		return repository.findById(seedId).get();
	}

	@Override
	public Seed viewSeed(String commonName) {
		return repository.findSeedByCommonName(commonName);
	}

	@Override
	public List<Seed> viewAllSeeds() {
		return repository.findAll();
	}

	@Override
	public List<Seed> viewAllSeeds(String typeOfSeed) {
		return repository.findSeedsByTypeOfSeeds(typeOfSeed);
	}

}
