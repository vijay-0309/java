package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.dto.AccountsDTO;

public class Bank {
public AccountsDTO[] accounts;
	
	int index;
	private static int s=0;
	
	public Bank(int size) {
		accounts=new AccountsDTO[size];
	}
	
	//create foods:
	public boolean createAccounts(AccountsDTO accounts) {
		boolean isCreated=false;
		System.out.println("inside create accounts");
		if(accounts!=null) {
			this.accounts[index++]=accounts;
			isCreated=true;
		}
		else {
			System.out.println("No accounts are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getAccounts() {
		for(int i=0;i<accounts.length-s;i++) {
			System.out.println(accounts[i]);
		}
	}
	
	//get operation:
	public boolean getAccountByName(String acName) {
		boolean f=false;
		AccountsDTO account =null;
		if(accounts!=null) {
			for(int i=0;i<accounts.length;i++){
				if(accounts[i]!=null) {
				if(accounts[i].getAcName().equals(acName)){
					System.out.println("Account found by name:"+acName);
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
			System.out.println("No Account found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateBalenceByAcNo(int balence,long acNo) {
		boolean update=false;
		AccountsDTO account =null;
		System.out.println("inside update method");
		if(balence>0 && acNo>0) {
			for(int i=0;i<accounts.length;i++) {
				if(accounts[i].getAcNo()==acNo) {
					System.out.println("Account balence updated by Account number:"+acNo);
					accounts[i].setBalence(balence);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("Account balence is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteAccountByAccountNumber(long acNo) {
		boolean delete=false;
		int id=0;
		AccountsDTO account=null;
		System.out.println("inside delete operation");
		if(acNo>0) {
			for(int i=0;i<accounts.length;i++) {
				if(accounts[i].getAcNo()==acNo) {
					System.out.println("account deleted by account number:"+acNo);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				else {
					delete=false;
				}
			}
			if(accounts.length==1){
				accounts[0]=null;
			}
			else{
				for(int i=id;i<accounts.length-1;i++) {
					accounts[i]=accounts[i+1];
				}
			}
		}
		if(delete==false){
			System.out.println("No account is deleted");
		}
		return delete;
	}

}
