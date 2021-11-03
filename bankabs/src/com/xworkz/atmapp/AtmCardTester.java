package com.xworkz.atmapp;

import java.util.*;

public class AtmCardTester {
	public static void main(String[] args) {
		Scanner atmCard=new Scanner(System.in);
		int choice;
		String text;
		String bank;
		
		do {
			
			System.out.println("press 1 to get sbi bank atm card");
			System.out.println("press 2 to get icici bank atm card");
			System.out.println("Enter your choice:");
			choice =atmCard.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Welcome to SBI bank ATM");
				ICard card=AtmcardFactory.getCard("SBI");
				if(card!=null) {
					card.cInsert();
					card.cSwap();
				}
				break;
			case 2:
				System.out.println("Welcome to ICICI Bank ATM");
				ICard card1=AtmcardFactory.getCard("ICICI");
				if(card1!=null) {
					card1.cInsert();
					card1.cSwap();
				}
				break;
			default:
				System.out.println("please enter valid choice...");
			}
			System.out.println("if you want to continue?...press y or n.");
			text=atmCard.next();
		}while(text.equals("y"));
		
		System.out.println("thank you for choosing bank's atm application");
		
	}

}
