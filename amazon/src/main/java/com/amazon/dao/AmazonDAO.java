package com.amazon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.amazon.entity.AmazonUser;

public class AmazonDAO implements AmazonDAOInterface {

	@Override
	public int createprofileDAO(AmazonUser au) {
		int result=0;
		try {
			//step 1 load driver
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 create connection with database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay","root","rajesh");
			//step 3 create query
			PreparedStatement ps=con.prepareStatement("insert into amazonuser values(?,?,?,?)");
			ps.setString(1, au.getName());
			ps.setString(2, au.getPasswpord());
			ps.setString(3, au.getEmail());
			ps.setString(4, au.getAddress());
			//step 4 execute query via executeUpdate() method if query is from insert, delete and update
			//       and use executeQuery() method if query is select
			//       executeUpdate() method will return int means no of rows affected by query
			//       executeQuery() method return type will be ResultSet
			
			result=ps.executeUpdate();
			
		}
		catch(Exception e) {		
		}
		return result;
	}

	@Override
	public AmazonUser viewProfileDAO(AmazonUser au) {
		AmazonUser result=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from amazonuser where email=?");
			ps.setString(1, au.getEmail());
						
			 ResultSet res =ps.executeQuery();
			 
			 if(res.next()) {
				String n= res.getString(1);
				String p= res.getString(2);
				String e= res.getString(3);
				String a= res.getString(4);
				
				result=new AmazonUser();
				result.setName(n);
				result.setPasswpord(p);
				result.setEmail(e);
				result.setAddress(a);
			 }
			
		}
		catch(Exception e) {		
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<AmazonUser> viewAllProfileDAO() {
		ArrayList<AmazonUser> result=new ArrayList<AmazonUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from amazonuser ");
									
			 ResultSet res =ps.executeQuery();
			 
			 while(res.next()) {
				String n= res.getString(1);
				String p= res.getString(2);
				String e= res.getString(3);
				String a= res.getString(4);
				
				AmazonUser result1=new AmazonUser();
				result1.setName(n);
				result1.setPasswpord(p);
				result1.setEmail(e);
				result1.setAddress(a);
				
				result.add(result1);
				
			 }
			
		}
		catch(Exception e) {		
			e.printStackTrace();
		}
		return result;
	}

}














