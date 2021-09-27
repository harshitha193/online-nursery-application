package com.sprint.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "planter")

public class Planter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "planterid")
	private int planterId;
	@Column(name = "planterheight")
	private float planterHeight;
	private int planterCapacity;
	private int planterColor;
	private String planterShape;
	private int planterStock;
	private int planterCost;
	
	@OneToMany(mappedBy="planter", cascade=CascadeType.ALL)
	private Set<Plant> setOfPlant=new HashSet<>();
	
	@OneToMany(mappedBy="planter", cascade=CascadeType.ALL)
	private Set<Seed> setOfSeed=new HashSet<>();
	
//	private Plant plants;
//	private Seed seed;
	
	public int getPlanterId() {
		return planterId;
	}

	public void setPlanterId(int planterId) {
		this.planterId = planterId;
	}

	public float getPlanterHeight() {
		return planterHeight;
	}

	public void setPlanterHeight(float planterHeight) {
		this.planterHeight = planterHeight;
	}

	public int getPlanterCapacity() {
		return planterCapacity;
	}

	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}

	public int getPlanterColor() {
		return planterColor;
	}

	public void setPlanterColor(int planterColor) {
		this.planterColor = planterColor;
	}

	public String getPlanterShape() {
		return planterShape;
	}

	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}

	public int getPlanterStock() {
		return planterStock;
	}

	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}

	public int getPlanterCost() {
		return planterCost;
	}

	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}

//	public Plant getPlants() {
//		return plants;
//	}
//
//	public void setPlants(Plant plants) {
//		this.plants = plants;
//	}
	
	public Set<Plant> getPlant() {
		return setOfPlant;
	}
	public void setPlant(Set<Plant> setOfPlant) {
		this.setOfPlant = setOfPlant;
	}
	
	public Set<Seed> getSeed() {
		return setOfSeed;
	}
	public void setSeed(Set<Seed> setOfSeed) {
		this.setOfSeed = setOfSeed;
	}

}
