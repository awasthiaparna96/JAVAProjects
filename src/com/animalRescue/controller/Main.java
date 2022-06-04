package com.animalRescue.controller;

import com.animalRescue.model.AnimalModel;
import com.animalRescue.view.AnimalView;

public class Main {

	public static void main(String[] args) {


		AnimalModel animalModel = getDetailsFromDatabase();
		AnimalView animalView = new AnimalView();
		
		Controller animalController = new Controller(animalModel, animalView);
		
		animalController.updateView();
		
		animalController.setAnimalType("Cat");
		
		animalController.updateView();

	}

	private static AnimalModel getDetailsFromDatabase() {
		AnimalModel model = new AnimalModel();
		model.setAnimalType("Dog");
		model.setDaysOfRescue(10);
		model.setFosterParent("Aparna");
		return model;
	}

}
