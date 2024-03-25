package com.jdbc.preparedstmt;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("delete from user where id=103");
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Deleted Successfully...");
			}
			else System.out.println("Deleted Failed...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
