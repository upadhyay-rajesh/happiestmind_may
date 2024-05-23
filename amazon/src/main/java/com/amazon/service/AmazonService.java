package com.amazon.service;

import java.util.ArrayList;

import com.amazon.dao.AmazonDAO;
import com.amazon.dao.AmazonDAOInterface;
import com.amazon.entity.AmazonUser;

public class AmazonService implements AmazonServiceInterface {

	@Override
	public int createProfileService(AmazonUser au) {
		AmazonDAOInterface ad=new AmazonDAO();
		int i=ad.createprofileDAO(au);
		return i;
	}

	@Override
	public AmazonUser viewProfileService(AmazonUser au) {
		AmazonDAOInterface ad=new AmazonDAO();
		AmazonUser s=ad.viewProfileDAO(au);
		return s;
	}

	@Override
	public ArrayList<AmazonUser> viewAllProfileService() {
		AmazonDAOInterface ad=new AmazonDAO();
		ArrayList<AmazonUser> ll= ad.viewAllProfileDAO();
		return ll;
	}

}








