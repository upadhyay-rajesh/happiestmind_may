package com.facebook.service;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser f1) {
		//System.out.println("i am service layer detail received from controller "+f1.getName()+"  "+f1.getPassword()+" "+f1.getEmail()+"  "+f1.getAddress());
		
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(f1);
		
		return i;
	}

}
