package model.dao.impl;

import java.util.List;

import model.dao.EmployeeDao;
import model.entities.Employee;

//adapter pattern
public class AdapterEmployeeDaoNoSql implements EmployeeDao{
	
	EmployeeDaoNoSql service = new EmployeeDaoNoSql();

	@Override
	public Employee getEmployee(Integer id) {
		
		return service.getEmployeeList(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		service.addEmployeeList(employee);
	}

	@Override
	public void editEmployee(Employee employee) {
		service.editEmployeeList(employee);
	}

	@Override
	public void removeEmployee(Employee employee) {
		service.removeEmployeeList(employee);
	}

	@Override
	public List<Employee> getAll() {
		return service.getAllList();
	}

}
