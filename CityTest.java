package com.xworkz.cityapp.city;

import java.util.Scanner;

import com.xworkz.cityapp.dto.CompaniesDTO;


public class CityTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to udyana nagari");
		System.out.println("Enter the number of companies");
		int size=sc.nextInt();
		
		City city=new City(size);
		
		for(int i=0;i<size;i++) {
			CompaniesDTO company=new CompaniesDTO();
			System.out.println("Enter company id");
			company.setId(sc.nextInt());
			
			System.out.println("Enter company name ");
			company.setcName(sc.next());
			
			System.out.println("Enter company headQuarter");
			company.setHeadQuarter(sc.next());
			
			
			boolean isCreated=city.createCompanies(company);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get company Details");
			System.out.println("press 2 to get company by id");
			System.out.println("press 3 to update HeadQuarter  by id");
			System.out.println("press 4 to delete company by id");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				city.getCompanies();
				break;
			case 2:
				System.out.println("enter company id");
				boolean id=city.getCompanyById(sc.nextInt());
				if(id!=false) {
					System.out.println(id);
					city.getCompanies();				}
				else {
					System.out.println("No company found by id");
				}
				break;
			case 3:
				System.out.println("enter id and headQuarter to update");
				boolean update=city.updateHeadQuarterByid(sc.nextInt(), sc.next());
				if(update!=false) {
					System.out.println(update);
					city.getCompanies();
				}
				else {
					System.out.println("No headQuarter is  updated");
				}
				break;
			case 4:
				System.out.println("enter company id to delete");
				boolean delete=city.deleteCompanyById(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					city.getCompanies();
				}
				else {
					System.out.println("No company is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for choosing company.....");
		
			
		}


}
