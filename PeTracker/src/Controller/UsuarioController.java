package Controller;

import java.util.ArrayList;

import entities.Usuario;
import services.UsuarioService;

public class UsuarioController {
	
	UsuarioService service = new UsuarioService();
	
	public ArrayList<Usuario> getUsers() {
		return service.select();
	}
	
	public void insertUser(Usuario A) {
		service.insert(A);
	}

	
}
