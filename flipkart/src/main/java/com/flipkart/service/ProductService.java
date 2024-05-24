package com.flipkart.service;

import java.util.ArrayList;

import com.flipkart.dao.ProductDAO;
import com.flipkart.dao.ProductDAOInterface;
import com.flipkart.entity.Product;

public class ProductService implements ProductServiceInterface {

	@Override
	public int createProductService(Product p) {
		ProductDAOInterface productDAO=new ProductDAO();
		int i=productDAO.createProductDAO(p);
		return i;
	}

	@Override
	public Product viewProductService(Product p) {
		ProductDAOInterface productDAO=new ProductDAO();
		Product p1=productDAO.viewProductDAO(p);
		return p1;
	}

	@Override
	public ArrayList<Product> viewAllProductService() {
		ProductDAOInterface productDAO=new ProductDAO();
		ArrayList<Product> ll=productDAO.viewAllProductDAO();
		return ll;
	}

	@Override
	public ArrayList<Product> viewProductByNameService(Product p) {
		ProductDAOInterface productDAO=new ProductDAO();
		ArrayList<Product> ll=productDAO.viewProductByNameDAO(p);
		return ll;
	}

	@Override
	public int deleteProductByProductIdService(Product p) {
		ProductDAOInterface productDAO=new ProductDAO();
		int i=productDAO.deleteProductByProductIdDAO(p);
		return i;
	}

	@Override
	public int editProductService(Product ppp) {
		ProductDAOInterface productDAO=new ProductDAO();
		int i=productDAO.editProductByProductIdDAO(ppp);
		return i;
	}

}
