package com.amazon.dao;

import java.util.ArrayList;

import com.amazon.entity.AmazonUser;

public interface AmazonDAOInterface {

	int createprofileDAO(AmazonUser au);

	AmazonUser viewProfileDAO(AmazonUser au);

	ArrayList<AmazonUser> viewAllProfileDAO();

}
