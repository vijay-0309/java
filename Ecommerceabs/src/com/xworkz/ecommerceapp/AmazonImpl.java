package com.xworkz.ecommerceapp;

public class AmazonImpl implements IApplication {
	
	@Override
	public void mobiles() {
		System.out.println("available mobile brands are:");
		System.out.println("Xiomi");
		System.out.println("Realme");
		System.out.println("Vivo");
		System.out.println("Apple"+"\n");
	}

	@Override
	public void fashion() {
		System.out.println("available dresses are:");
		System.out.println("Shirts");
		System.out.println("T-Shirts");
		System.out.println("Kurtha");
		System.out.println("kids wears"+"\n");
	}

	@Override
	public void appliances() {
		System.out.println("available things are:");
		System.out.println("Washing-Machine");
		System.out.println("Refrigerator");
		System.out.println("Air-Conditioners");
		System.out.println("microwave-oven"+"\n");
	}

	@Override
	public void groceries() {
		System.out.println("available groceries are:");
		System.out.println("Biscuits");
		System.out.println("Juice");
		System.out.println("Cooking oil");
		System.out.println("soaps"+"\n");
	}

}
