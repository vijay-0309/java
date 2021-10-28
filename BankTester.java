package com.xworkz.bankapp.bank;

import java.util.Scanner;

import com.xworkz.bankapp.dto.AccountsDTO;



public class BankTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Sbi bank");
		System.out.println("Enter the number of accounts");
		int size=sc.nextInt();
		
		Bank bank=new Bank(size);
		
		for(int i=0;i<size;i++) {
			AccountsDTO account=new AccountsDTO();
			System.out.println("Enter Account name");
			account.setAcName(sc.next());
			
			System.out.println("Enter account type ");
			account.setAcType(sc.next());
			
			System.out.println("Enter Account number");
			account.setAcNo(sc.nextLong());
			
			System.out.println("Enter account balence");
			account.setBalence(sc.nextInt());
			
			
			boolean isCreated=bank.createAccounts(account);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get account details");
			System.out.println("press 2 to get account by name");
			System.out.println("press 3 to update balence by account number");
			System.out.println("press 4 to delete account by account number");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				bank.getAccounts();;
				break;
			case 2:
				System.out.println("enter account name");
				boolean name=bank.getAccountByName(sc.next());
				if(name!=false) {
					System.out.println(name);
					bank.getAccounts();				}
				else {
					System.out.println("No account found by name");
				}
				break;
			case 3:
				System.out.println("enter balence and account number to update");
				boolean update=bank.updateBalenceByAcNo(sc.nextInt(), sc.nextLong());
				if(update!=false) {
					System.out.println(update);
					bank.getAccounts();
				}
				else {
					System.out.println("No balence is  updated");
				}
				break;
			case 4:
				System.out.println("enter account number to delete");
				boolean delete=bank.deleteAccountByAccountNumber(sc.nextLong());
				if(delete!=false) {
					System.out.println(delete);
					bank.getAccounts();
				}
				else {
					System.out.println("No account is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for visiting.....");
		
			
		}


}
