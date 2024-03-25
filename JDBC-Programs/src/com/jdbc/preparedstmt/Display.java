package com.jdbc.preparedstmt;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("Select * from user");
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				System.out.println("Id :"+res.getInt(1));
				System.out.println("Name : "+res.getString(2));
				System.out.println("Branch : "+res.getString(3));
				System.out.println("--------------------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
