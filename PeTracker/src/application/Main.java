package application;

import entities.Admin;
import entities.Animal;
import entities.Usuario;
import pattern.Facade;

public class Main {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		facade.addAdmin(new Admin());
		facade.addAnimal(new Animal());
		facade.addUsuario(new Usuario());
		
		facade.getAdmins();
		facade.getAnimais();
		facade.getUsuarios();
		
	
	}

}
