package model.dao;

import model.entities.Employee;

public interface EmployeeDao {
	
	public Employee getEmployee (Integer id);
	
	public void addEmployee(Employee employee);

	public void editEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	

}
