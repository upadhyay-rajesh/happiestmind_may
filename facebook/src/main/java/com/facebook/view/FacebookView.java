package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {
	
	public static void main(String[] args) {
		
		String ss="y";
		
		while(ss.equals("y")) {
		
		System.out.println("*****************************MAIN MENU******************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to login ");
		System.out.println("press 4 to search profile");
		System.out.println("press 5 to delete profile");
		System.out.println("press 6 to edit profile");
		System.out.println("press 7 to view all profile");
		
		//scanner class is used to take input from user
		//System.in indicate input
		//System class indicate console
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int choice=sc.nextInt();
		
		FacebookControllerInterface f=new FacebookController();
		
		switch(choice) {
		case 1: f.createProfile();
			break;
		case 2:   f.viewProfile();
			break;
		case 3: f.loginProfile();
			break;
		case 4: f.searchProfile();
			break;
		case 5: f.deleteProfile();
			break;
		case 6: f.editProfile();
			break;
		case 7: f.viewAllProfile();
			break;
			default: System.out.println("wrong choice");
		}
		
		System.out.println("do you want to continue press y or n");
		ss=sc.next();
		}

	}

	
}
