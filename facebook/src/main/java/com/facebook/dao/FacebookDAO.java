package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	@Override
	public int createProfileDAO(FacebookUser f1) {
		System.out.println("i am dao layer detail received from service "+f1.getName()+"  "+f1.getPassword()+" "+f1.getEmail()+"  "+f1.getAddress());
		int i=0;
		try {
			//step 1 load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindmay","root","rajesh");
			
			//step 3 generate query
			PreparedStatement ps=con.prepareStatement("insert into facebook values(?,?,?,?)");
			ps.setString(1, f1.getName());
			ps.setString(2, f1.getPassword());
			ps.setString(3, f1.getEmail());
			ps.setString(4, f1.getAddress());
			
			//step 4 execute query
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return i;
	}

}
