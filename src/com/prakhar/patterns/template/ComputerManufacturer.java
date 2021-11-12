package com.prakhar.patterns.template;

public abstract class ComputerManufacturer {
	
	public void buildComputer() {
		
		System.out.println(addHardDisk());
		System.out.println(addRAM());
		System.out.println(addKeyboard());
		
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRAM();
	
	public abstract String addKeyboard();

}
