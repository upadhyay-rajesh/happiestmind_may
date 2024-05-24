package com.flipkart.view;

import java.util.Scanner;

import com.flipkart.controller.FlipkartController;
import com.flipkart.controller.FlipkartControllerInterface;

public class FlipkartView {

	public static void main(String[] args) {
		String ss="y";
		while(ss.equals("y")) {
			System.out.println("*************MAIN MENU***********");
			System.out.println("press 1 to create product");
			System.out.println("press 2 to view product");
			System.out.println("press 3 to view all product");
			System.out.println("press 4 to view product depends on name");
			System.out.println("press 5 to delete product depends on product id");
			System.out.println("press 6 to update product depends on product id");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			FlipkartControllerInterface flipkartController=new FlipkartController();
			
			switch(choice) {
			case 1 : flipkartController.createProductController();
				break;
			case 2 : flipkartController.viewProductController();
			break;
			case 3 : flipkartController.viewAllProductController();
			break;
			case 4 : flipkartController.viewProductByNameController();
			break;
			case 5 : flipkartController.deleteProductByProductIdController();
			break;
			case 6 : flipkartController.editProductByProductIdController();
			break;
				default: System.out.println("wrong choice");
			}
			System.out.println("to continue press y");
			ss=sc.next();
		}

	}

}
