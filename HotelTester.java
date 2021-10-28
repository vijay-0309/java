package com.xworkz.hotelapplication.hoteltester;

import java.util.Scanner;

import com.xworkz.hotelapplication.dto.FoodItemsDTO;

public class HotelTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to kamath hotel");
		System.out.println("Enter the number of dishes");
		int size=sc.nextInt();
		
		Hotel hotel=new Hotel(size);
		
		for(int i=0;i<size;i++) {
			FoodItemsDTO food=new FoodItemsDTO();
			System.out.println("Enter enter food id");
			food.setId(sc.nextInt());
			
			System.out.println("Enter food name ");
			food.setName(sc.next());
			
			System.out.println("Enter food type");
			food.setType(sc.next());
			
			System.out.println("enter food price");
			food.setPrice(sc.nextInt());
			
			boolean isCreated=hotel.createFoods(food);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get foods");
			System.out.println("press 2 to get food by name");
			System.out.println("press 3 to update food by id");
			System.out.println("press 4 to delete food");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				hotel.getFoods();
				break;
			case 2:
				System.out.println("enter food name");
				boolean name=hotel.getFoodByName(sc.next());
				if(name!=false) {
					System.out.println(name);
					hotel.getFoods();				}
				else {
					System.out.println("No food found by name");
				}
				break;
			case 3:
				System.out.println("enter id and food name to update");
				boolean update=hotel.updatefoodNameByid(sc.nextInt(), sc.next());
				if(update!=false) {
					System.out.println(update);
					hotel.getFoods();
				}
				else {
					System.out.println("No food name updated");
				}
				break;
			case 4:
				System.out.println("enter food id to delete");
				boolean delete=hotel.deleteFoodById(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					hotel.getFoods();
				}
				else {
					System.out.println("No food is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for coming to our hotel");
		
			
		}

}
