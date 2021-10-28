package com.xworkz.cityapp.city;

import com.xworkz.cityapp.dto.CompaniesDTO;

public class City {
public CompaniesDTO[] company;
	
	int index;
	private static int s=0;
	
	public City(int size) {
		company =new CompaniesDTO[size];
	}
	
	//create operation:
	public boolean createCompanies(CompaniesDTO company) {
		boolean isCreated=false;
		System.out.println("inside create companies");
		if(company!=null) {
			this.company[index++]=company;
			isCreated=true;
		}
		else {
			System.out.println("No companies are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getCompanies() {
		for(int i=0;i<company.length-s;i++) {
			System.out.println(company[i]);
		}
	}
	
	//get operation:
	public boolean getCompanyById(int id) {
		boolean f=false;
		CompaniesDTO comp=null;
		if(company!=null) {
			for(int i=0;i<company.length;i++){
				if(company[i]!=null) {
				if(company[i].getId()==id){
					System.out.println("Company found by id:"+id);
					f=true;
					break;
				}
				else {
					f=false;
				}
			}
			}
		}
		if(f==false) {
			System.out.println("No company found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateHeadQuarterByid(int id,String headQuarter) {
		boolean update=false;
		CompaniesDTO comp=null;
		System.out.println("inside update method");
		if(id>0 && headQuarter!=null) {
			for(int i=0;i<company.length;i++) {
				if(company[i].getId()==id) {
					System.out.println("company HeadQuarter  updated by id:"+id);
					company[i].setHeadQuarter(headQuarter);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("company HeadQuarter is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteCompanyById(int cId) {
		boolean delete=false;
		int id=0;
		CompaniesDTO comp=null;
		System.out.println("inside delete operation");
		if(cId>0) {
			for(int i=0;i<company.length;i++) {
				if(company[i].getId()==cId) {
					System.out.println("company  deleted by id:"+cId);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(company.length==1){
				company[0]=null;
			} 
			else{
				for(int i=id;i<company.length-1;i++) {
					company[i]=company[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No company is deleted");
		}
		return delete;
	}

}
