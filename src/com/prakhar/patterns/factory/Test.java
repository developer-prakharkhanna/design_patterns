package com.prakhar.patterns.factory;

public class Test {

	public static void main(String[] args) {
		
		PersonDirectory pd = new PersonDirectory();
		pd.createPerson("male");
		
	}

}
