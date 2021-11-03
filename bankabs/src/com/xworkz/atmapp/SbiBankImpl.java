package com.xworkz.atmapp;

public class SbiBankImpl implements ICard {

	@Override
	public void cInsert() {
		System.out.println("Your card is inserted");

	}

	@Override
	public void cSwap() {
		System.out.println("please swipe your card");

	}

}
