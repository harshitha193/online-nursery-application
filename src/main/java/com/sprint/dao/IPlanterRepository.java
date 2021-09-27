package com.sprint.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.sprint.entities.Planter;
@Repository
public interface IPlanterRepository extends JpaRepository<Planter, Integer> {

	Planter findByPlanterShape(String planterShape);

	List<Planter> findPlantersByPlanterCostBetween(double minCost, double maxCost);

	//void deleteByPlanterName(int planterId);

	
	
}