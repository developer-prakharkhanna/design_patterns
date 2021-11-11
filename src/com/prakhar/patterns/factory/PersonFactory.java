package com.prakhar.patterns.factory;

public class PersonFactory {
	
	public static Person createPerson(String type) {
		
		Person p = null;
		
		if(type.equalsIgnoreCase("male")) {
			p = new Male();
		}else if(type.equalsIgnoreCase("female")) {
			p = new Female();
		}
		
		return p;
	}

}
