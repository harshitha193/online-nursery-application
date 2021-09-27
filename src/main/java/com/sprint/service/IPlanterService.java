package com.sprint.service;

import java.util.List;

import com.sprint.entities.Planter;

public interface IPlanterService {
	public Planter addPlanter( Planter  planter);
	   public Planter updatePlanter( Planter  planter);
	   public void deletePlanter( int  planterId);
	   public Planter viewPlanter( int  planterId);
	   public Planter viewPlanter( String planterShape);
	   public List<Planter> viewAllPlanters();
	   public List<Planter> viewAllPlanters(double minCost, double maxCost);
}


