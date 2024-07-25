package builder;

import entities.Person;

public interface PersonBuilder {
	
	public Person getPerson(String name, Integer Age);
	public void setGender();
	public void setName(String name);
	public void setAge(Integer age);
	public void setDateSignIn();
	
}
