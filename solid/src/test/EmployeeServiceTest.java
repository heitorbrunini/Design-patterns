package test;

import org.junit.jupiter.api.Test;

import model.dao.EmployeeDao;
import model.dao.TaskDao;
import model.dao.impl.EmployeeDaoNoSql;
import model.dao.impl.TaskDaoNoSql;
import model.entities.CltEmployee;
import model.entities.Employee;
import model.entities.Task;
import model.services.EmployeeService;

class EmployeeServiceTest {

	EmployeeDao empRepository = new EmployeeDaoNoSql();
	TaskDao taskRepository = new TaskDaoNoSql();

	EmployeeService service = new EmployeeService(taskRepository, empRepository);

	@Test
	void createAndRecovery() {

		Employee employee = new CltEmployee(2, null, "James Baxter", "123.123.122.32", "449944");

		service.addEmployee(employee);

		assert (service.getEmployee(2)).equals(employee);
	}

	@Test
	void addTask() {

		Employee employee = new CltEmployee(1, null, "James Baxter", "123.123.122.32", "449944");
		service.addEmployee(employee);
		
		Task task = new Task(1, "doThings", false);
		
		service.addTask(task, employee);
		assert(service.getTask(employee)).equals(task);

	}

	
}
