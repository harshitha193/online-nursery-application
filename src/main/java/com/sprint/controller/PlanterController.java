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

import com.sprint.entities.Planter;
import com.sprint.serviceImpl.PlanterServiceImpl;

@RestController
@RequestMapping("/planter")
public class PlanterController {
	@Autowired
	PlanterServiceImpl  planterService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Planter addPlanter(@RequestBody Planter planter) {
		return planterService.addPlanter(planter);
	}
	@PutMapping("/updatePlanter")
	public Planter updatePlanter(@RequestBody Planter planter) {
		return planterService.updatePlanter(planter);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePlanter(@PathVariable int planterId)
	{
		planterService.deletePlanter(planterId);
	}
	@GetMapping("/viewPlanter/{id}")
	public Planter viewPlanter(@PathVariable int planterId) {
		return planterService.viewPlanter(planterId);
	}
	
	@GetMapping("/viewPlant/{planterShape}")
	public Planter viewPlanter(@PathVariable String planterShape) {
		return planterService.viewPlanter(planterShape);
	}
	@GetMapping("/viewAllPlanters")
	public List<Planter> viewAllPlanter() {
		return planterService.viewAllPlanters();
	}
	@GetMapping("/viewAllPlanters/{cost}")
	public List<Planter> viewAllPlanters(@PathVariable double minCost, double maxCost){
		return planterService.viewAllPlanters(minCost, maxCost );
	}

}