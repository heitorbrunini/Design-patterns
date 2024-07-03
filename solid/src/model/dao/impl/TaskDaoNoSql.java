package model.dao.impl;

import database.DB;
import model.dao.TaskDao;
import model.entities.Employee;
import model.entities.Task;

//SRP, DIP
public class TaskDaoNoSql implements TaskDao{
	
	DB db = DB.getInstance();
	
	@Override
	public void addTask(Task task, Employee employee) {
		
		int index = db.getTb_employee().indexOf(employee);
		
		db.getTb_employee().get(index).setTask(task);
	}

	@Override
	public void doTask(Task newTask, Employee employee) {
		
		int index = db.getTb_employee().indexOf(employee);
		
		db.getTb_employee().get(index).setTask(new Task(newTask.id(),newTask.name(), true));	
		
	}
	
	@Override
	public void removeTask(Employee employee) {
		employee.setTask(null);
	}

	@Override
	public Task getTask(Employee employee) {
		
		return employee.getTask();
	}
	
}
