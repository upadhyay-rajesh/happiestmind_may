package com.amazon.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.amazon.entity.AmazonUser;
import com.amazon.service.AmazonService;
import com.amazon.service.AmazonServiceInterface;
import com.amazon.utility.SortByEmail;

public class AmazonController implements AmazonControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String address=sc.next();
		
		AmazonUser au=new AmazonUser();
		au.setName(name);
		au.setPasswpord(password);
		au.setEmail(email);
		au.setAddress(address);
		
		AmazonServiceInterface ai=new AmazonService();
		
		int i=ai.createProfileService(au);
		
		if(i>0) {
			System.out.println("Profile created ");
		}
		else {
			System.out.println("could not create profile");
		}

	}

	@Override
	public void viewProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email to view profile");
		String email=sc.next();
		
		AmazonUser au=new AmazonUser();
		au.setEmail(email);
		
		AmazonServiceInterface as=new AmazonService();
		AmazonUser aaa=as.viewProfileService(au);
		
		if(aaa!=null) {
			System.out.println("Your profile is ");
			System.out.println("Name is "+aaa.getName());
			System.out.println("Password is "+aaa.getPasswpord());
			System.out.println("Email is "+aaa.getEmail());
			System.out.println("Address is "+aaa.getAddress());
		}
		
	}

	@Override
	public void viewAllProfileController() {
		AmazonServiceInterface as=new AmazonService();
		ArrayList<AmazonUser> ll=    as.viewAllProfileService();
		
		System.out.println(ll.size()+"  record found");
		System.out.println("before sorting");
		for(AmazonUser aaa:ll) {
			System.out.println("***********************");
			System.out.println("Your profile is ");
			System.out.println("Name is "+aaa.getName());
			System.out.println("Password is "+aaa.getPasswpord());
			System.out.println("Email is "+aaa.getEmail());
			System.out.println("Address is "+aaa.getAddress());
		}
		
		System.out.println("after sorting based on email");
		
		Collections.sort(ll, new SortByEmail());
		
		for(AmazonUser aaa:ll) {
			System.out.println("***********************");
			System.out.println("Your profile is ");
			System.out.println("Name is "+aaa.getName());
			System.out.println("Password is "+aaa.getPasswpord());
			System.out.println("Email is "+aaa.getEmail());
			System.out.println("Address is "+aaa.getAddress());
		}
		
		ll.forEach(abc->{
			System.out.println("***********************");
			System.out.println("Your profile is ");
			System.out.println("Name is "+abc.getName());
			System.out.println("Password is "+abc.getPasswpord());
			System.out.println("Email is "+abc.getEmail());
			System.out.println("Address is "+abc.getAddress());
		});
		
	}

}










