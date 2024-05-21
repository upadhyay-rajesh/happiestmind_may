package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;

public class FacebookController {
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

	public void viewAllProfile() {
		System.out.println("all profile viewed");
	}

}
