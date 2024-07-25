package entities;

import java.time.LocalDateTime;

public class Person {
	
	private String gender;
	private String name;
	private Integer age;
	private LocalDateTime date;
	
	public Person () {
		
	}

	public Person(String gender, String name, Integer age, LocalDateTime date) {
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
