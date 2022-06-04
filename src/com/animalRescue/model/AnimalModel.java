package com.animalRescue.model;

public class AnimalModel {
	
	private String animalType;
	private int daysOfRescue;
	private String fosterParent;
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getDaysOfRescue() {
		return daysOfRescue;
	}
	public void setDaysOfRescue(int daysOfRescue) {
		this.daysOfRescue = daysOfRescue;
	}
	public String getFosterParent() {
		return fosterParent;
	}
	public void setFosterParent(String fosterParent) {
		this.fosterParent = fosterParent;
	}
	@Override
	public String toString() {
		return "AnimalModel [animalType=" + animalType + ", daysOfRescue=" + daysOfRescue + ", fosterParent="
				+ fosterParent + "]";
	}
	

}
