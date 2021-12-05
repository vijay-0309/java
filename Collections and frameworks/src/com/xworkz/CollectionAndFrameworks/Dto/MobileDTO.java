package com.xworkz.CollectionAndFrameworks.Dto;

public class MobileDTO {
	private String mobileBrand;
	private String model;
	private int cost;
	public MobileDTO(String mobileBrand,String model,int cost) {
		this.mobileBrand=mobileBrand;
		this.model=model;
		this.cost=cost;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "MobileDTO [mobileBrand=" + mobileBrand + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
