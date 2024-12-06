package services;

import java.util.ArrayList;

import entities.Usuario;

public class UsuarioService {
	
	ArrayList<Usuario> pessoas = new ArrayList<Usuario>();
		
	public ArrayList<Usuario> select(){
		return this.pessoas;
	}
	
	public void insert(Usuario usr) {
		this.pessoas.add(usr);
	}
	

}
