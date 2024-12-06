package services;

import java.util.ArrayList;

import entities.Animal;

public class AnimalService{
	
	ArrayList<Animal> animais = new ArrayList<Animal>();
		
	public ArrayList<Animal> select(){
		return this.animais;
	}
	
	public void insert(Animal usr) {
		this.animais.add(usr);
	}
	

}
