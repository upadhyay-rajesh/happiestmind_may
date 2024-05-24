package com.flipkart.service;

import java.util.ArrayList;

import com.flipkart.entity.Product;

public interface ProductServiceInterface {

	int createProductService(Product p);

	Product viewProductService(Product p);

	ArrayList<Product> viewAllProductService();

	ArrayList<Product> viewProductByNameService(Product p);

	int deleteProductByProductIdService(Product p);

	int editProductService(Product ppp);

}
