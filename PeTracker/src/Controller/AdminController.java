package Controller;

import java.util.ArrayList;

import entities.Admin;
import services.AdminService;

public class AdminController {
	
	AdminService service = new AdminService();
	
	public ArrayList<Admin> getAdmins() {
		return service.select();
	}
	
	public void insertAdmins(Admin A) {
		service.insert(A);
	}

	
}
