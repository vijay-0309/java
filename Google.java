package com.xworkz.googleapp.google;

import com.xworkz.googleapp.dto.GoogleApplicationsDTO;

public class Google {
public GoogleApplicationsDTO[] google;
	
	int index;
	private static int s=0;
	
	public Google(int size) {
		google =new GoogleApplicationsDTO[size];
	}
	
	//create operation:
	public boolean createApplications(GoogleApplicationsDTO google) {
		boolean isCreated=false;
		System.out.println("inside create applications");
		if(google!=null) {
			this.google[index++]=google;
			isCreated=true;
		}
		else {
			System.out.println("No applications are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getApplications() {
		for(int i=0;i<google.length-s;i++) {
			System.out.println(google[i]);
		}
	}
	
	//get operation:
	public boolean getAppBySize(int size) {
		boolean f=false;
		GoogleApplicationsDTO app=null;
		if(google!=null) {
			for(int i=0;i<google.length;i++){
				if(google[i]!=null) {
				if(google[i].getSizeInMb()==size){
					System.out.println("application found by size:"+size);
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
			System.out.println("No application found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateAppTypeByName(String name,String type) {
		boolean update=false;
		GoogleApplicationsDTO app=null;
		System.out.println("inside update method");
		if(type!=null && name!=null) {
			for(int i=0;i<google.length;i++) {
				if(google[i].getName().equals(name)) {
					System.out.println("application type updated by name:"+name);
					google[i].setType(type);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("application type is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteApplicationByName(String name) {
		boolean delete=false;
		int id=0;
		GoogleApplicationsDTO app=null;
		System.out.println("inside delete operation");
		if(name!=null) {
			for(int i=0;i<google.length;i++) {
				if(google[i].getName().equals(name)) {
					System.out.println("application deleted by name:"+name);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(google.length==1){
				google[0]=null;
			} 
			else{
				for(int i=id;i<google.length-1;i++) {
					google[i]=google[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No Application  is deleted");
		}
		return delete;
	}


}
