package com.xworkz.CollectionAndFrameworks.comparator;

import java.util.Comparator;

import com.xworkz.CollectionAndFrameworks.setInterface.PetDTO;

public class PetNameComparator implements Comparator<PetDTO>{
	

	@Override
	public int compare(PetDTO o1, PetDTO o2) {
			return Integer.parseInt(o1.getName())- Integer.parseInt(o2.getName());
	}

}
