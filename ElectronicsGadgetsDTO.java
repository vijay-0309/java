package com.xworkz.shopapp.dto;

public class ElectronicsGadgetsDTO {
	private int id;
	private String name;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ElectronicsGadgetsDTO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
