package test;

import org.junit.jupiter.api.Test;

import builder.FemaleBuilder;
import builder.MaleBuilder;
import builder.PersonBuilder;
import entities.Person;

class PersonBuilderTest {
	
	PersonBuilder builder;
	Person person;

	@Test
	void MaleTest() {
		builder =  new MaleBuilder();		
		person = builder.getPerson("Jonh Doe",32 );
		
		assert(person.getGender()=="male");
	}
	
	@Test
	void FemaleTest() {
		builder =  new FemaleBuilder();		
		person = builder.getPerson("Jane Doe",32 );
		
		assert(person.getGender()=="female");
	}

}
