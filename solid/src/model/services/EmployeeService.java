package model.services;

import java.util.List;

import model.dao.EmployeeDao;
import model.dao.TaskDao;
import model.entities.Employee;
import model.entities.Task;

//DIP
public class EmployeeService {
	
	TaskDao repositoryTask;
	EmployeeDao repositoryEmployee;

	public EmployeeService(TaskDao repositoryTask, EmployeeDao repositoryEmployee) {
		this.repositoryTask = repositoryTask;
		this.repositoryEmployee = repositoryEmployee;
	}
	
	public void addEmployee( Employee employee) {
		repositoryEmployee.addEmployee(employee);
	}
	
	public void editEmployee(Employee emp) {
		repositoryEmployee.editEmployee(emp);
	}
	
	public void removeEmployee(Employee removeEmployee) {
		repositoryEmployee.removeEmployee(removeEmployee);
	}
	
	public Employee getEmployee (Integer id) {
		return repositoryEmployee.getEmployee(id);
	}
	
	public List<Employee> getAll(){
		return repositoryEmployee.getAll();
	}
	
	public void addTask(Task task, Employee employee) {
		repositoryTask.addTask(task, employee);
	}
	
	public void doTask(Task newTask, Employee employee) {
		repositoryTask.doTask(newTask, employee);
	}
	
	public void removeTask(Employee employee) {
		repositoryTask.removeTask(employee);
	}
	
	public Task getTask(Employee employee) {
		return repositoryTask.getTask(employee);
	}
	
}
