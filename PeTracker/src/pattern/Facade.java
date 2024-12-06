package pattern;

import java.util.ArrayList;

import Controller.AdminController;
import Controller.AnimalController;
import Controller.UsuarioController;
import entities.Admin;
import entities.Animal;
import entities.Usuario;

public class Facade {

	AdminController controller1 =  new AdminController();
	AnimalController controller2 =  new AnimalController();
	UsuarioController controller3 =  new UsuarioController();
	
	public void addAdmin(Admin a) {
		controller1.insertAdmins(a);
	}
	
	public void addAnimal(Animal a) {
		controller2.insertAnimais(a);
	}
	
	public void addUsuario(Usuario u) {
		controller3.insertUser(u);
	}
	
	public ArrayList<Admin> getAdmins(){
		return controller1.getAdmins();
	}
	
	public ArrayList<Animal> getAnimais(){
		return controller2.getAnimais();
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return controller3.getUsers();
	}
	
}
