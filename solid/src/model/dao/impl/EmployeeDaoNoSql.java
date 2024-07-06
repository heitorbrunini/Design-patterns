package model.dao.impl;

import java.util.List;

import database.DB;
import model.dao.EmployeeDao;
import model.entities.Employee;
//SRP, DIP
public class EmployeeDaoNoSql implements EmployeeDao{
	
	DB db = DB.getInstance();

	@Override
	public void addEmployee(Employee employee) {
		db.getTb_employee().add(employee);
		
	}

	@Override
	public void editEmployee(Employee employee) {
		
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if (db.getTb_employee().get(i).getId()== employee.getId()) {
				db.getTb_employee().set(i, employee);
				break;
			}
		}
	}

	@Override
	public void removeEmployee(Employee removeEmployee) {
		
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if ( db.getTb_employee().get(i).hashCode() == removeEmployee.hashCode()) {
				db.getTb_employee().remove(i);
				break;
			}	
		}
	}

	@Override
	public Employee getEmployee(Integer id) {
		for (int i = 0; i < db.getTb_employee().size(); i++) {

			if ( db.getTb_employee().get(i).getId() == id ) {
				
				return db.getTb_employee().get(i);
			}	
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return db.getTb_employee();
	}
	

}
