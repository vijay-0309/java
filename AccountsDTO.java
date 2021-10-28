package com.xworkz.bankapp.dto;

public class AccountsDTO {
	private String acName;
	private String acType;
	private long acNo;
	private int balence;
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public int getBalence() {
		return balence;
	}
	public void setBalence(int balence) {
		this.balence = balence;
	}
	@Override
	public String toString() {
		return "AccountsDTO [acName=" + acName + ", acType=" + acType + ", acNo=" + acNo + ", balence=" + balence + "]";
	}
	
	
}
