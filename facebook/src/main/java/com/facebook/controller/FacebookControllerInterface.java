package com.facebook.controller;

public interface FacebookControllerInterface {
	
	int i=9; //all the variable of an interface by default will be public , static and final
	
	 void createProfile();
	 void viewProfile();
	 void editProfile();
	 void searchProfile();

	 void deleteProfile();

	 void loginProfile();

	 void viewAllProfile();
	 
	 default void hello() {
		 System.out.println("hello");
	 }
	 static void add() {
		 System.out.println("i am static method inside interface");
	 }
	
}











