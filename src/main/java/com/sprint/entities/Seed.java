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
import com.sun.istack.NotNull;

@Entity
@Table(name="seed")
public class Seed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@NotNull
	@Column(name="seedid",unique=true)
	private int seedId;
	@Column(name="commonname")
	private String commonName;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private String temperature;
	private String typeOfSeeds;
	private String seedsDescription;
	private int seedsStock;
	private double seedCost;
	private int seedsPerPacket;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="planterid")
	private Planter planter;
	
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
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
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
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
	public String getTypeOfSeeds() {
		return typeOfSeeds;
	}
	public void setTypeOfSeeds(String typeOfSeeds) {
		this.typeOfSeeds = typeOfSeeds;
	}
	public String getSeedsDescription() {
		return seedsDescription;
	}
	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}
	public int getSeedsStock() {
		return seedsStock;
	}
	public void setSeedsStock(int seedsStock) {
		this.seedsStock = seedsStock;
	}
	public double getSeedCost() {
		return seedCost;
	}
	public void setSeedCost(double seedCost) {
		this.seedCost = seedCost;
	}
	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}
	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}
	
	@JsonIgnore
	public Planter getPlanter() {
		return planter;
	}
	public void setPlanter(Planter planter) {
		this.planter = planter;
	}
	
}