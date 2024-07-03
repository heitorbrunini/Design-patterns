package model.services;

import model.dao.EmployeeDao;
import model.dao.TaskDao;

//classes devem depender apenas de abstrações
public class EmployeeService {
	
	TaskDao repositoryTask;
	EmployeeDao repositoryEmployee;

	public EmployeeService(TaskDao repositoryTask, EmployeeDao repositoryEmployee) {
		this.repositoryTask = repositoryTask;
		this.repositoryEmployee = repositoryEmployee;
	}
	
	

}
