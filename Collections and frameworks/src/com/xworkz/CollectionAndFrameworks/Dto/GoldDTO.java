package com.xworkz.CollectionAndFrameworks.Dto;

public class GoldDTO {
	private int goldId;
	private String type;
	public GoldDTO(int goldId,String type) {
		this.goldId=goldId;
		this.type=type;
	}
	public int getGoldId() {
		return goldId;
	}
	public void setGoldId(int goldId) {
		this.goldId = goldId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "GoldDTO [goldId=" + goldId + ", type=" + type + "]";
	}
	

}
