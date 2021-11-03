package com.xworkz.atmapp;

public class IciciBankImpl implements ICard{

	@Override
	public void cInsert() {
		System.out.println("please insert your card");
		
	}

	@Override
	public void cSwap() {
		System.out.println("your card is swiped");
		
	}

}
