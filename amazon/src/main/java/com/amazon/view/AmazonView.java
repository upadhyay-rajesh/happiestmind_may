package com.amazon.view;

import java.util.Scanner;

import com.amazon.controller.AmazonController;
import com.amazon.controller.AmazonControllerInterface;

public class AmazonView {

	public static void main(String[] args) {
		
		String ss="y";
		while(ss.equals("y")) {
		
		System.out.println("****************Main Menu************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to view all profile");
		
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in); //Scanner class is use to take input from user
		int choice=sc.nextInt(); // nextInt will read input from console in integer format
		
		AmazonControllerInterface ac=new AmazonController();
		
		switch(choice) {
		case 1 : ac.createProfileController();
			break;
		case 2 : ac.viewProfileController();
			break;
		case 3 : ac.viewAllProfileController();
			break;
			default : System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next(); //next() method of Scanner class will read string data
		}

	}

}
