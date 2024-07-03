package database;

import java.util.ArrayList;
import java.util.List;

import model.entities.Employee;

public class DB {
	
	private static DB instance;

	private List<Employee> tb_employee = new ArrayList<>();

	private DB() {
	}
	
	public static DB getInstance() {
		
		if (instance == null) {
			instance =  new DB();
		}
		
		return instance;
		
	}

	public List<Employee> getTb_employee() {
		return tb_employee;
	}

	public void setTb_employee(List<Employee> tb_employee) {
		this.tb_employee = tb_employee;
	} 
	
	
	
	
}
