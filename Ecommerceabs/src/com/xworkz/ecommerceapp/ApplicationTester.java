package com.xworkz.ecommerceapp;

public class ApplicationTester {
	public static void main(String[] args) {
		IApplication iApplication = new FlipkartImpl();
		System.out.println("Welcome to Flip-kart");
		iApplication.appliances();
		iApplication.fashion();
		iApplication.mobiles();
		iApplication.groceries();

		IApplication iApplication1 = new AmazonImpl();
		System.out.println("Welcome to Amazon");
		iApplication1.appliances();
		iApplication1.fashion();
		iApplication1.mobiles();
		iApplication1.groceries();

	}
}
