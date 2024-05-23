package com.amazon.utility;

import java.util.Comparator;

import com.amazon.entity.AmazonUser;

public class SortByEmail implements Comparator<AmazonUser>{

	@Override
	public int compare(AmazonUser o1, AmazonUser o2) {
		// TODO Auto-generated method stub
		return o1.getEmail().compareTo(o2.getEmail());
	}
	
}
