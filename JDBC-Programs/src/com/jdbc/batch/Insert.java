package com.jdbc.batch;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("Insert into user values(?,?,?)");
			pstmt.setInt(1, 100);
			pstmt.setString(2, "Nagesh");
			pstmt.setString(3, "CSE");
			pstmt.addBatch();
			
			pstmt.setInt(1, 103);
			pstmt.setString(2, "Manu");
			pstmt.setString(3, "CE");
			pstmt.addBatch();
			
			int[] eb = pstmt.executeBatch();
			for(int e:eb) {
				System.out.println("Inserted SuccessFully...");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
