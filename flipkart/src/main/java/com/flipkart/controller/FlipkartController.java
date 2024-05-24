package com.flipkart.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.flipkart.entity.Product;
import com.flipkart.exception.HighPriceException;
import com.flipkart.service.ProductService;
import com.flipkart.service.ProductServiceInterface;

public class FlipkartController implements FlipkartControllerInterface {

	@Override
	public void createProductController() {
		try {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Product Name");
		String product_name=input.next();
		
		System.out.println("Enter Product Price");
		float product_price=input.nextFloat();
		
		if(product_price>100.56) {
			throw new HighPriceException();
		}
		
		System.out.println("Enter Product Specification");
		String product_specification=input.next();
		
		Product p=new Product();
		p.setProduct_name(product_name);
		p.setProduct_price(product_price);
		p.setProduct_specification(product_specification);
		
		ProductServiceInterface productService=new ProductService();
		int i=productService.createProductService(p);
		
		if(i>0) {
			System.out.println("Product Added in Database");
		}
		}
		catch(HighPriceException e) {
			System.out.println(e);
		}
		

	}

	@Override
	public void viewProductController() {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Product id to view product detail");
		String product_id=input.next();
		
		Product p=new Product();
		p.setProduct_id(product_id);
		
		ProductServiceInterface productService=new ProductService();
		Product p1=productService.viewProductService(p);
		
		if(p1!=null) {
			System.out.println("product detail is ");
			System.out.println("product id "+p1.getProduct_id());
			System.out.println("product name "+p1.getProduct_name());
			System.out.println("product price "+p1.getProduct_price());
			System.out.println("product specification "+p1.getProduct_specification());
			
		}
		else {
			System.out.println("product with "+product_id+" not found in database");
		}
	}

	@Override
	public void viewAllProductController() {
		ProductServiceInterface productService=new ProductService();
		ArrayList<Product> ll=  productService.viewAllProductService();
		
		System.out.println(ll.size()+" record found in database");
		
		for(Product p1:ll) {
			System.out.println("******************");
			System.out.println("product detail is ");
			System.out.println("product id "+p1.getProduct_id());
			System.out.println("product name "+p1.getProduct_name());
			System.out.println("product price "+p1.getProduct_price());
			System.out.println("product specification "+p1.getProduct_specification());
		}
		
		ll.forEach(p1->{
			System.out.println("******************");
			System.out.println("product detail is ");
			System.out.println("product id "+p1.getProduct_id());
			System.out.println("product name "+p1.getProduct_name());
			System.out.println("product price "+p1.getProduct_price());
			System.out.println("product specification "+p1.getProduct_specification());
		});
	}

	@Override
	public void viewProductByNameController() {
Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Product name to view product detail");
		String product_name=input.next();
		
		Product p=new Product();
		p.setProduct_name(product_name);
		
		ProductServiceInterface productService=new ProductService();
		ArrayList<Product> ll=productService.viewProductByNameService(p);
		
		System.out.println(ll.size()+" record found in database with name "+product_name);
		
		for(Product p1:ll) {
			System.out.println("******************");
			System.out.println("product detail is ");
			System.out.println("product id "+p1.getProduct_id());
			System.out.println("product name "+p1.getProduct_name());
			System.out.println("product price "+p1.getProduct_price());
			System.out.println("product specification "+p1.getProduct_specification());
		}
		
	}

	@Override
	public void deleteProductByProductIdController() {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Product id to delete product");
		String product_id=input.next();
		
		Product p=new Product();
		p.setProduct_id(product_id);
		
		ProductServiceInterface productService=new ProductService();
		int ll=productService.deleteProductByProductIdService(p);
		
		if(ll>0) {
			System.out.println("Product deleted from Database");
		}
		
	}

	@Override
	public void editProductByProductIdController() {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Product id to edit product");
		String product_id=input.next();
		
		Product p=new Product();
		p.setProduct_id(product_id);
		
		ProductServiceInterface productService=new ProductService();
		Product p1=productService.viewProductService(p);
		
		if(p1!=null) {
			System.out.println("product detail is ");
			System.out.println("product id "+p1.getProduct_id());
			System.out.println("product name "+p1.getProduct_name());
			System.out.println("product price "+p1.getProduct_price());
			System.out.println("product specification "+p1.getProduct_specification());
			
			System.out.println("Main Menu to Edit Record");
			System.out.println("press 1 to edit product name");
			System.out.println("press 2 to edit product price");
			System.out.println("press 3 to edit product specification");
			
			System.out.println("enter choice");
			int c=input.nextInt();
			
			Product ppp=new Product();
			
			switch(c) {
			case 1:  System.out.println("enter new product name"); 
					String p_name=input.next();
					ppp.setProduct_name(p_name);
					ppp.setProduct_id(p1.getProduct_id());
			
				break;
			case 2:
				System.out.println("enter new product price"); 
				float p_price=input.nextFloat();
				ppp.setProduct_price(p_price);
				ppp.setProduct_id(p1.getProduct_id());
				break;
			case 3:
				System.out.println("enter new product specification"); 
				String p_spec=input.next();
				ppp.setProduct_specification(p_spec);
				ppp.setProduct_id(p1.getProduct_id());
				break;
				default: System.out.println("wrong choice");
			}
			
		
			int j=productService.editProductService(ppp);
			if(j>0) {
				System.out.println("product edited");
			}
			
		}
		else {
			System.out.println("product with "+product_id+" not found in database");
		}
		
	}

}













