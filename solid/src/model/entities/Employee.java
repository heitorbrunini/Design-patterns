package model.entities;

public abstract class Employee {

	private Integer id;
	private String name;
	private Task task;
		
	Employee (){
		
	}

	public Employee(Integer id, String name, Task task) {
		this.task = task;
		this.id = id;
		this.name = name;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Double pagamento() {		
		return null;
	}
	
}
