package com.xworkz.gymapp.gym;

import java.util.Scanner;

import com.xworkz.gymapp.dto.EquipmentsDTO;

public class GymTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to gym");
		System.out.println("Enter the number of equipments");
		int size=sc.nextInt();
		
		Gym gym=new Gym(size);
		
		for(int i=0;i<size;i++) {
			EquipmentsDTO material=new EquipmentsDTO();
			System.out.println("Enter equipment id");
			material.setId(sc.nextInt());
			
			System.out.println("Enter equipment name ");
			material.setName(sc.next());
			
			System.out.println("Enter equipment cost");
			material.setCost(sc.nextInt());
			
			
			boolean isCreated=gym.createMaterials(material);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get equipments Details");
			System.out.println("press 2 to get equipments by id");
			System.out.println("press 3 to update equipment cost by id");
			System.out.println("press 4 to delete equipment by name");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				gym.getEquipments();
				break;
			case 2:
				System.out.println("enter equipment id");
				boolean id=gym.getEquipmentsById(sc.nextInt());
				if(id!=false) {
					System.out.println(id);
					gym.getEquipments();			}
				else {
					System.out.println("No equipment found");
				}
				break;
			case 3:
				System.out.println("enter equipment id and cost to update");
				boolean update=gym.updateCostById(sc.nextInt(), sc.nextInt());
				if(update!=false) {
					System.out.println(update);
					gym.getEquipments();
				}
				else {
					System.out.println("No cost is  updated");
				}
				break;
			case 4:
				System.out.println("enter equipment name  to delete");
				boolean delete=gym.deleteEquipmentByName(sc.next());
				if(delete!=false) {
					System.out.println(delete);
					gym.getEquipments();
				}
				else {
					System.out.println("No equipment is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("than you for buying equiment.....");
		
			
		}

}
