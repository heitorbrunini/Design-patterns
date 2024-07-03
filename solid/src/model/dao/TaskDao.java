package model.dao;

import model.entities.Employee;
import model.entities.Task;

public interface TaskDao {
	
	public Task getTask(Employee employee);

	public void addTask(Task task, Employee employee);

	public void doTask(Task newTask, Employee employee);
	
	public void removeTask(Employee employee);
	
}
