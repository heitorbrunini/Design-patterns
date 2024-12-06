package services;

import java.util.ArrayList;

import entities.Admin;

public class AdminService {
	
	ArrayList<Admin> pessoas = new ArrayList<Admin>();
		
	public ArrayList<Admin> select(){
		return this.pessoas;
	}
	
	public void insert(Admin usr) {
		this.pessoas.add(usr);
	}
	

}
