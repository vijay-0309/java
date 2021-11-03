package com.xworkz.abstractfiles;

public class LightApp {
	public static ISwitch getLight(String type) {
		if(type.equals("TubeLight")) {
			return new TubeLightImpl();
		}
		else if(type.equals("CflBulb")) {
			return new CflBulbImpl();
		}
		else {
			System.out.println("no bulb found");
		}
		return null;
	}

}
