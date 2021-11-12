package com.prakhar.patterns.template;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Hard disk added to laptop";
	}

	@Override
	public String addRAM() {
		return "RAM added to laptop";
	}

	@Override
	public String addKeyboard() {
		return "Keyboard added to laptop";
	}

}
