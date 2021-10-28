package com.xworkz.googleapp.google;

import java.util.Scanner;

import com.xworkz.googleapp.dto.GoogleApplicationsDTO;



public class GoogleTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Google");
		System.out.println("Enter the number of applications");
		int size=sc.nextInt();
		
		Google google=new Google(size);
		
		for(int i=0;i<size;i++) {
			GoogleApplicationsDTO app=new GoogleApplicationsDTO();
			System.out.println("Enter application name");
			app.setName(sc.next());
			
			System.out.println("Enter application size in mb ");
			app.setSizeInMb(sc.nextInt());
			
			System.out.println("Enter application type");
			app.setType(sc.next());
			
			
			boolean isCreated=google.createApplications(app);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get application Details");
			System.out.println("press 2 to get application by size");
			System.out.println("press 3 to update application type by name");
			System.out.println("press 4 to delete application by name");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				google.getApplications();
				break;
			case 2:
				System.out.println("enter application size");
				boolean s=google.getAppBySize(sc.nextInt());
				if(s!=false) {
					System.out.println(s);
					google.getApplications();				}
				else {
					System.out.println("No application  found by size");
				}
				break;
			case 3:
				System.out.println("enter name and size to update");
				boolean update=google.updateAppTypeByName(sc.next(), sc.next());
				if(update!=false) {
					System.out.println(update);
					google.getApplications();
				}
				else {
					System.out.println("No size  is  updated");
				}
				break;
			case 4:
				System.out.println("enter application name to delete");
				boolean delete=google.deleteApplicationByName(sc.next());
				if(delete!=false) {
					System.out.println(delete);
					google.getApplications();
				}
				else {
					System.out.println("No application is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for choosing application .....");
		
			
		}


}
