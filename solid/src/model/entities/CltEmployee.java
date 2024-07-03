package model.entities;

public class CltEmployee extends Employee {	

	private String cpf;
	private String pisPasep;
	
	public CltEmployee(Integer id, Task task, String name, String cpf, String pisPasep) {
		super(id, name, task);
		this.cpf = cpf;
		this.pisPasep = pisPasep;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPisPasep() {
		return pisPasep;
	}
	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}
	
	
	
}
