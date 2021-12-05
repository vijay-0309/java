package com.xworkz.CollectionAndFrameworks.setInterface;

import java.util.Comparator;

public class BankDTO implements Comparable<BankDTO>{

	private int id;
	private String accHolderName;
	private long accNumber;
	private String accType;
	private String bankName;
	
	public BankDTO(int id, String accHolderName, long accNumber, String accType, String bankName) {
		this.id = id;
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
		this.accType = accType;
		this.bankName = bankName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", accHolderName=" + accHolderName + ", accNumber=" + accNumber + ", accType="
				+ accType + ", bankName=" + bankName + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public int compareTo(BankDTO o) {
		// TODO Auto-generated method stub
		return this.hashCode() - o.hashCode();
	}
	
	
}
