package com.xworkz.hotelapplication.dto;

public class FoodItemsDTO {
	private int id;
	private String name;
	private String type;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItemsDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
