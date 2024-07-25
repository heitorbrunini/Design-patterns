package model.dao.impl;

import java.util.List;

import database.DB;
import model.entities.Employee;
//SRP, DIP
public class EmployeeDaoNoSql {
	
	DB db = DB.getInstance();

	public void addEmployeeList(Employee employee) {
		db.getTb_employee().add(employee);
		
	}

	public void editEmployeeList(Employee employee) {
		
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if (db.getTb_employee().get(i).getId()== employee.getId()) {
				db.getTb_employee().set(i, employee);
				break;
			}
		}
	}

	public void removeEmployeeList(Employee removeEmployee) {
		
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if ( db.getTb_employee().get(i).hashCode() == removeEmployee.hashCode()) {
				db.getTb_employee().remove(i);
				break;
			}	
		}
	}

	public Employee getEmployeeList(Integer id) {
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if ( db.getTb_employee().get(i).getId() == id ) {
				
				return db.getTb_employee().get(i);
			}	
		}
		return null;
	}

	public List<Employee> getAllList() {
		return db.getTb_employee();
	}
	

}
