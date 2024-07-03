package model.entities;

public class PjEmployee extends Employee{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public PjEmployee() {
		
	}

	public PjEmployee(Integer id, Task task,String name, String cnpj) {
		super(id, name, task);
		this.cnpj = cnpj;		
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
