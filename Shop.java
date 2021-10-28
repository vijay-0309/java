package com.xworkz.shopapp.shoptest;

import com.xworkz.shopapp.dto.ElectronicsGadgetsDTO;

public class Shop {
public ElectronicsGadgetsDTO[] things;
	
	int index;
	private static int s=0;
	
	public Shop(int size) {
		things =new ElectronicsGadgetsDTO[size];
	}
	
	//create operation:
	public boolean createThings(ElectronicsGadgetsDTO things) {
		boolean isCreated=false;
		System.out.println("inside create gadgets");
		if(things!=null) {
			this.things[index++]=things;
			isCreated=true;
		}
		else {
			System.out.println("No gadgets are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getGadgets() {
		for(int i=0;i<things.length-s;i++) {
			System.out.println(things[i]);
		}
	}
	
	//get operation:
	public boolean getgadgetByName(String gadgetName) {
		boolean f=false;
		ElectronicsGadgetsDTO gadget=null;
		if(things!=null) {
			for(int i=0;i<things.length;i++){
				if(things[i]!=null) {
				if(things[i].getName().equals(gadgetName)){
					System.out.println("Gadget found by name:"+gadgetName);
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
			System.out.println("No gadget found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updatePriceByid(int id,int price) {
		boolean update=false;
		ElectronicsGadgetsDTO gadget=null;
		System.out.println("inside update method");
		if(id>0 && price >0) {
			for(int i=0;i<things.length;i++) {
				if(things[i].getId()==id) {
					System.out.println("gadget price updated by id:"+id);
					things[i].setPrice(price);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("gadget price is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteGadgetById(int gadgetId) {
		boolean delete=false;
		int id=0;
		ElectronicsGadgetsDTO gadget=null;
		System.out.println("inside delete operation");
		if(gadgetId>0) {
			for(int i=0;i<things.length;i++) {
				if(things[i].getId()==gadgetId) {
					System.out.println("gadget deleted by id:"+gadgetId);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(things.length==1){
				things[0]=null;
			} 
			else{
				for(int i=id;i<things.length-1;i++) {
					things[i]=things[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No gadget is deleted");
		}
		return delete;
	}

}
