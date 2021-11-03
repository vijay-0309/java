package com.xworkz.abstractfiles;

public class TubeLightImpl implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("Tube light turned on...");
		
	}

	@Override
	public void sOff() {
		System.out.println("Tube light turned off....");
		
	}

}
