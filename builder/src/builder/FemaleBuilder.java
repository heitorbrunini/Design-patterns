package builder;

import java.time.LocalDateTime;

import entities.Person;

public class FemaleBuilder implements PersonBuilder {
	
	Person person = new Person();	

	@Override
	public void setGender() {
		
		person.setGender("female");

	}

	@Override
	public void setName(String name) {
		
		person.setName(name);

	}

	@Override
	public void setAge(Integer age) {
		
		person.setAge(age);

	}

	@Override
	public void setDateSignIn() {
		
		person.setDate(LocalDateTime.now());

	}

	@Override
	public Person getPerson(String name, Integer Age) {
		this.setAge(Age);
		this.setDateSignIn();
		this.setName(name);
		this.setGender();
		return this.person;
	}


}