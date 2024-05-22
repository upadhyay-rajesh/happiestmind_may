package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{
	public void createProfile() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter Password");
		String password=sc.next();
		
		System.out.println("enter Email");
		String email=sc.next();
		
		System.out.println("enter Address");
		String address=sc.next();
		
		FacebookUser f1=new FacebookUser();
		f1.setName(name);
		f1.setPassword(password);
		f1.setEmail(email);
		f1.setAddress(address);
		
		
		FacebookServiceInterface fs=new FacebookService();
		
		int i=fs.createProfileService(f1);
		if(i>0) {
			System.out.println("Registration success");
		}
		else {
			System.out.println("registration fail");
		}
		
		
	}

	public void viewProfile() {
		System.out.println("profile viewed");
	}

	public void editProfile() {
		System.out.println("profile edited");
	}

	public void searchProfile() {
		System.out.println("profile found");
	}

	public void deleteProfile() {
		System.out.println("profile deleted");
	}

	public void loginProfile() {
		System.out.println("profile logied in");
	}

	@Override
	public void viewAllProfile() {
		// TODO Auto-generated method stub
		
	}

	

}
