package com.xworkz.shopapp.shoptest;

import java.util.Scanner;

import com.xworkz.shopapp.dto.ElectronicsGadgetsDTO;



public class ShopTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Sriram shop");
		System.out.println("Enter the number of gadgets");
		int size=sc.nextInt();
		
		Shop sh=new Shop(size);
		
		for(int i=0;i<size;i++) {
			ElectronicsGadgetsDTO gadgets=new ElectronicsGadgetsDTO();
			System.out.println("Enter gadget  id");
			gadgets.setId(sc.nextInt());
			
			System.out.println("Enter gadget name ");
			gadgets.setName(sc.next());
			
			System.out.println("Enter gadget price");
			gadgets.setPrice(sc.nextInt());
			
			
			boolean isCreated=sh.createThings(gadgets);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get gadgets");
			System.out.println("press 2 to get gadget by name");
			System.out.println("press 3 to update price  by id");
			System.out.println("press 4 to delete gadget by id");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				sh.getGadgets();
				break;
			case 2:
				System.out.println("enter gadget name");
				boolean name=sh.getgadgetByName(sc.next());
				if(name!=false) {
					System.out.println(name);
					sh.getGadgets();				}
				else {
					System.out.println("No gadget found by name");
				}
				break;
			case 3:
				System.out.println("enter id and price to update");
				boolean update=sh.updatePriceByid(sc.nextInt(), sc.nextInt());
				if(update!=false) {
					System.out.println(update);
					sh.getGadgets();
				}
				else {
					System.out.println("No gadget price is  updated");
				}
				break;
			case 4:
				System.out.println("enter gadget id to delete");
				boolean delete=sh.deleteGadgetById(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					sh.getGadgets();
				}
				else {
					System.out.println("No gadget is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for buying equipments...");
		
			
		}

}
