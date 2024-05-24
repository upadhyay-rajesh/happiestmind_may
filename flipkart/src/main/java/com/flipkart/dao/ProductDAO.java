package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.flipkart.entity.Product;

public class ProductDAO implements ProductDAOInterface {

	@Override
	public int createProductDAO(Product p) {
		int result = 0;

		String a = p.getProduct_name().substring(0, 2);
		System.out.println(a);

		int number = (int) ((Math.random()) * 10000);
		System.out.println(number);

		String p_id = a + number;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");

			PreparedStatement ps = con.prepareStatement("insert into flipkart_product values(?,?,?,?)");

			ps.setString(1, p.getProduct_name());
			ps.setFloat(2, p.getProduct_price());
			ps.setString(3, p.getProduct_specification());
			ps.setString(4, p_id);

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Product viewProductDAO(Product p) {
		Product result = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");

			PreparedStatement ps = con.prepareStatement("select * from flipkart_product where product_id=?");
			ps.setString(1, p.getProduct_id());

			ResultSet res = ps.executeQuery();
			if (res.next()) {

				String p_name = res.getString("product_name");
				float p_price = res.getFloat("product_price");
				String p_specification = res.getString("product_specification");
				String p_id = res.getString("product_id");

				result = new Product();
				result.setProduct_id(p_id);
				result.setProduct_name(p_name);
				result.setProduct_price(p_price);
				result.setProduct_specification(p_specification);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public ArrayList<Product> viewAllProductDAO() {
		ArrayList<Product> result = new ArrayList<Product>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");

			PreparedStatement ps = con.prepareStatement("select * from flipkart_product");

			ResultSet res = ps.executeQuery();
			while (res.next()) {

				String p_name = res.getString("product_name");
				float p_price = res.getFloat("product_price");
				String p_specification = res.getString("product_specification");
				String p_id = res.getString("product_id");

				Product result1 = new Product();
				result1.setProduct_id(p_id);
				result1.setProduct_name(p_name);
				result1.setProduct_price(p_price);
				result1.setProduct_specification(p_specification);

				result.add(result1);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<Product> viewProductByNameDAO(Product p) {
		ArrayList<Product> result = new ArrayList<Product>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");

			PreparedStatement ps = con.prepareStatement("select * from flipkart_product where product_name=?");
			ps.setString(1, p.getProduct_name());

			ResultSet res = ps.executeQuery();
			while (res.next()) {

				String p_name = res.getString("product_name");
				float p_price = res.getFloat("product_price");
				String p_specification = res.getString("product_specification");
				String p_id = res.getString("product_id");

				Product result1 = new Product();
				result1.setProduct_id(p_id);
				result1.setProduct_name(p_name);
				result1.setProduct_price(p_price);
				result1.setProduct_specification(p_specification);

				result.add(result1);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteProductByProductIdDAO(Product p) {
		int result = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");

			PreparedStatement ps = con.prepareStatement("delete from flipkart_product where product_id=?");

			ps.setString(1, p.getProduct_id());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int editProductByProductIdDAO(Product ppp) {
		int result = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay", "root",
					"rajesh");
			
			String query=null;

			if (ppp.getProduct_name() != null) {
				query="update flipkart_product set product_name=? where product_id=?";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,ppp.getProduct_name() );
				ps.setString(2, ppp.getProduct_id());

				result = ps.executeUpdate();
			}
			if (ppp.getProduct_price() == 0) {
				query="update flipkart_product set product_price=? where product_id=?";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setFloat(1,ppp.getProduct_price() );
				ps.setString(2, ppp.getProduct_id());

				result = ps.executeUpdate();
			}
			if (ppp.getProduct_specification() != null) {
				query="update flipkart_product set product_specification=? where product_id=?";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,ppp.getProduct_specification() );
				ps.setString(2, ppp.getProduct_id());

				result = ps.executeUpdate();
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
