package com.xworkz.abstractfiles;

public class CflBulbImpl implements ISwitch {

	@Override
	public void sOn() {
		System.out.println("Cfl Bulb is glowing...");
		
	}

	@Override
	public void sOff() {
		System.out.println("Cfl Bulb is not glowing.....");
		
	}

}
