package com.animalRescue.controller;

import com.animalRescue.model.AnimalModel;
import com.animalRescue.view.AnimalView;

public class Controller {

	AnimalModel animalModel;
	AnimalView animalView;

	public Controller(AnimalModel animalModel, AnimalView animalView) {
		this.animalModel = animalModel;
		this.animalView = animalView;
	}

	public String getAnimalType() {
		return animalModel.getAnimalType();
	}

	public void setAnimalType(String animalType) {
		animalModel.setAnimalType(animalType);
	}

	public int getDaysOfRescue() {
		return animalModel.getDaysOfRescue();
	}

	public void setDaysOfRescue(int daysOfRescue) {
		animalModel.setDaysOfRescue(daysOfRescue);
	}

	public String getFosterParent() {
		return animalModel.getFosterParent();
	}

	public void setFosterParent(String fosterParent) {
		animalModel.setFosterParent(fosterParent);
	}

	public void updateView() {
		System.out.println(animalModel.toString());
		animalView.printDetails(getAnimalType(), getDaysOfRescue(), getFosterParent());
	}

}
