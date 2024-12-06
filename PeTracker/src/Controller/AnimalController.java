package Controller;

import java.util.ArrayList;

import entities.Animal;
import services.AnimalService;

public class AnimalController {
	
	AnimalService service = new AnimalService();
	
	public ArrayList<Animal> getAnimais() {
		return service.select();
	}
	
	public void insertAnimais(Animal A) {
		service.insert(A);
	}

	
}
