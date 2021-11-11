package com.prakhar.patterns.factory;

public class PersonDirectory {
	
	public Person createPerson(String type) {
		
		Person p = PersonFactory.createPerson(type);
		
		p.wish("Person is a " + type);
		
		return p;
		
	}
	
	

}
