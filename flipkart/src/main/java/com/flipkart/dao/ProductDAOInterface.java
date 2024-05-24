package com.flipkart.dao;

import java.util.ArrayList;

import com.flipkart.entity.Product;

public interface ProductDAOInterface {

	int createProductDAO(Product p);

	Product viewProductDAO(Product p);

	ArrayList<Product> viewAllProductDAO();

	ArrayList<Product> viewProductByNameDAO(Product p);

	int deleteProductByProductIdDAO(Product p);

	int editProductByProductIdDAO(Product ppp);

}
