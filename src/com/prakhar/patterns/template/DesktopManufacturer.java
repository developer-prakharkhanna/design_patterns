package com.prakhar.patterns.template;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Hard disk added to desktop";
	}

	@Override
	public String addRAM() {
		return "RAM added to desktop";
	}

	@Override
	public String addKeyboard() {
		return "Keyboard added to desktop";
	}

}
