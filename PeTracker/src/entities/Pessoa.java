package entities;

public abstract class Pessoa {
	
	protected Long id;
	protected String nome;
	protected String celular;
	protected String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(Long id, String nome, String celular, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.celular = celular;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
