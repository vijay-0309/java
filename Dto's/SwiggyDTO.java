package com.xworkz.CollectionAndFrameworks.Dto;

public class SwiggyDTO {
	private String ownerName;
	private int estYear;
	private String purpose;
	public SwiggyDTO(String ownerName,int estYear,String purpose) {
		this.ownerName=ownerName;
		this.estYear=estYear;
		this.purpose=purpose;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getEstYear() {
		return estYear;
	}
	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	@Override
	public String toString() {
		return "SwiggyDTO [ownerName=" + ownerName + ", estYear=" + estYear + ", purpose=" + purpose + "]";
	}
	

}
