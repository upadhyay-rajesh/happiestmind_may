package com.amazon.service;

import java.util.ArrayList;

import com.amazon.entity.AmazonUser;

public interface AmazonServiceInterface {

	int createProfileService(AmazonUser au);

	AmazonUser viewProfileService(AmazonUser au);

	ArrayList<AmazonUser> viewAllProfileService();

}
