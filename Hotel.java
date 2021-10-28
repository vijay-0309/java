package com.xworkz.hotelapplication.hoteltester;

import com.xworkz.hotelapplication.dto.FoodItemsDTO;

public class Hotel {
public FoodItemsDTO[] foods;
	
	int index;
	private static int s=0;
	
	public Hotel(int size) {
		foods =new FoodItemsDTO[size];
	}
	
	//create foods:
	public boolean createFoods(FoodItemsDTO foods) {
		boolean isCreated=false;
		System.out.println("inside create foods");
		if(foods!=null) {
			this.foods[index++]=foods;
			isCreated=true;
		}
		else {
			System.out.println("No foods are prepared");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getFoods() {
		for(int i=0;i<foods.length-s;i++) {
			System.out.println(foods[i]);
		}
	}
	
	//get operation:
	public boolean getFoodByName(String foodName) {
		boolean f=false;
		FoodItemsDTO food=null;
		if(foods!=null) {
			for(int i=0;i<foods.length;i++){
				if(foods[i]!=null) {
				if(foods[i].getName().equals(foodName)){
					System.out.println("food found by name:"+foodName);
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
			System.out.println("No food found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updatefoodNameByid(int id,String foodName) {
		boolean update=false;
		FoodItemsDTO food=null;
		System.out.println("inside update method");
		if(id>0 && foodName!=null) {
			for(int i=0;i<foods.length;i++) {
				if(foods[i].getId()==id) {
					System.out.println("food name updated by id:"+id);
					foods[i].setName(foodName);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("No food name updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteFoodById(int foodId) {
		boolean delete=false;
		int id=0;
		FoodItemsDTO food=null;
		System.out.println("inside delete operation");
		if(foodId>0) {
			for(int i=0;i<foods.length;i++) {
				if(foods[i].getId()==foodId) {
					System.out.println("food deleted by id:"+foodId);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(id!=-1) {
				for(int i=id;i<foods.length-1;i++) {
					foods[i]=foods[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No foods deleted");
		}
		return delete;
	}

}
