package entities;

public class Animal {

	private Long id;
	private String name;
	private Integer age;
	private String raca;

	private Long UsuarioId;

	public Animal() {
		
	}

	public Animal(Long id, String name, Integer age, String raca, Long UsuarioId) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.raca = raca;
		this.UsuarioId = UsuarioId;
	}

	public Long getUsuarioId() {
		return UsuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		UsuarioId = usuarioId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
