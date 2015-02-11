package com.shelan.zoo.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Animal {

	private int animalId;
	private String animalName;
	private String animalType;
	private int animalAge;
	
	private Cage cage=new Cage();
	
	private List<CageAllocation> cageAllocations=new ArrayList<CageAllocation>();
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(int animalId, String animalName, String animalType,
			int animalAge) {
		super();
		this.animalId = animalId;
		this.animalName = animalName;
		this.animalType = animalType;
		this.animalAge = animalAge;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	public List<CageAllocation> getCageAllocations() {
		return cageAllocations;
	}

	public void setCageAllocations(List<CageAllocation> cageAllocations) {
		this.cageAllocations = cageAllocations;
	}
			
	

}
