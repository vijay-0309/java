package com.xworkz.abstractfiles;

import java.util.*;

public class lightTester {
	public static void main(String[] args) {
		System.out.println("Enter the bulb type");
		Scanner app = new Scanner(System.in);

		ISwitch light = LightApp.getLight(app.next());
		if (light != null) {
			light.sOn();
			light.sOff();
		}

		ISwitch light1 = LightApp.getLight(app.next());
		if (light1 != null) {
			light1.sOn();
			light1.sOff();
		}
	}

}
