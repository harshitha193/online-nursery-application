package com.sprint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "plant")
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "plantId")
	private int plantId;
	@Column(name = "plantHeight")
	private int plantHeight;
	private String plantSpread;
	private String commonName;
	private String bloomTime;
	private String medicalOrCulinaryUse;
	private String difficultyLevel;
	private String temperature;
	private String typeOfPlant;
	private String plantDescription;
	private int plantStock;
	private double plantCost;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "planterid")
	private Planter planter;

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public int getPlantHeight() {
		return plantHeight;
	}

	public void setPlantHeight(int plantHeight) {
		this.plantHeight = plantHeight;
	}

	public String getPlantSpread() {
		return plantSpread;
	}

	public void setPlantSpread(String plantSpread) {
		this.plantSpread = plantSpread;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getBloomTime() {
		return bloomTime;
	}

	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}

	public String getMedicalOrCulinaryUse() {
		return medicalOrCulinaryUse;
	}

	public void setMedicalOrCulinaryUse(String medicalOrCulinaryUse) {
		this.medicalOrCulinaryUse = medicalOrCulinaryUse;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTypeOfPlant() {
		return typeOfPlant;
	}

	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}

	public String getPlantDescription() {
		return plantDescription;
	}

	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}

	public int getPlantStock() {
		return plantStock;
	}

	public void setPlantStock(int plantStock) {
		this.plantStock = plantStock;
	}

	public double getPlantCost() {
		return plantCost;
	}

	public void setPlantCost(double plantCost) {
		this.plantCost = plantCost;
	}

	@JsonIgnore
	public Planter getPlanter() {
		return planter;
	}

	public void setPlanter(Planter planter) {
		this.planter = planter;
	}

}
