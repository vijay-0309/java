package com.xworkz.atmapp;

public class AtmcardFactory {
	public static ICard getCard(String enter) {
		if(enter.equals("SBI")) {
			return new SbiBankImpl();
		}
		else if(enter.equals("ICICI")) {
			return new IciciBankImpl();
		}
		else {
			System.out.println("No Bank card found");
		}
		return null;
	}
}
