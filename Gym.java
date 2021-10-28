package com.xworkz.gymapp.gym;

import com.xworkz.gymapp.dto.EquipmentsDTO;

public class Gym {
public EquipmentsDTO[] material;
	
	int index;
	private static int s=0;
	
	public Gym(int size) {
		material=new EquipmentsDTO[size];
	}
	
	//create operation:
	public boolean createMaterials(EquipmentsDTO material) {
		boolean isCreated=false;
		System.out.println("inside create material");
		if(material!=null) {
			this.material[index++]=material;
			isCreated=true;
		}
		else {
			System.out.println("No equipments are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getEquipments() {
		for(int i=0;i<material.length-s;i++) {
			System.out.println(material[i]);
		}
	}
	
	//get operation:
	public boolean getEquipmentsById(int id) {
		boolean f=false;
		EquipmentsDTO thing=null;
		if(material!=null) {
			for(int i=0;i<material.length;i++){
				if(material[i]!=null) {
				if(material[i].getId()==id){
					System.out.println("equipment found by id:"+id);
					f=true;
					break;
				}
				}
				else {
					f=false;
				}
			}
		}
		if(f==false) {
			System.out.println("No equipment found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateCostById(int id,int cost) {
		boolean update=false;
		EquipmentsDTO thing=null;
		System.out.println("inside update method");
		if(id>0 && cost>0 ) {
			for(int i=0;i<material.length;i++) {
				if(material[i].getId()==id) {
					System.out.println("cost updated by id:"+id);
					material[i].setCost(cost);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("cost is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteEquipmentByName(String name) {
		boolean delete=false;
		int id=0;
		EquipmentsDTO thing=null;
		System.out.println("inside delete operation");
		if(name!=null) {
			for(int i=0;i<material.length;i++) {
				if(material[i].getName().equals(name)) {
					System.out.println("equipment deleted by name:"+name);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
					System.out.println("No equipment deleted");
				}
			}
			if(material.length==1) {
				material[0]=null;
			}
			else {
				for(int i=id;i<material.length-1;i++) {
					material[i]=material[i+1];
				}
			}
		}
		return delete;
	}


}
