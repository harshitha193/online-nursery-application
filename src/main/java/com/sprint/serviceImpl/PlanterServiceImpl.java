package com.sprint.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IPlanterRepository;
import com.sprint.entities.Planter;
import com.sprint.service.IPlanterService;

@Service
public class PlanterServiceImpl implements IPlanterService {
	@Autowired
	IPlanterRepository repository;

	@Override
	public Planter addPlanter(Planter planter) {

		return repository.save(planter);
	}

	@Override
	public Planter updatePlanter(Planter planter) {
		Planter planters = repository.findById(planter.getPlanterId())
				.orElseThrow(() -> new EntityNotFoundException("No planter found for the given Id"));
		planter.setPlanterHeight(planters.getPlanterHeight());
		return repository.save(planters);

	}

	@Override
	 public void deletePlanter( int  planterId){
		repository.deleteById(planterId);
	}

	@Override
	public Planter viewPlanter(int planterId) {

		return repository.findById(planterId).get();
	}

	@Override
	public Planter viewPlanter(String planterShape) {

		return repository.findByPlanterShape(planterShape);
	}

	@Override
	public List<Planter> viewAllPlanters() {

		return repository.findAll();
	}

	@Override
	public List<Planter> viewAllPlanters(double minCost, double maxCost) {

		return repository.findPlantersByPlanterCostBetween(minCost, maxCost);
	}

//	public List<Planter> viewAllPlanters(double minCost, double maxCost) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
