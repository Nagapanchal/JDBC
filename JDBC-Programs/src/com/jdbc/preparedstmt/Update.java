package com.jdbc.preparedstmt;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("update user set Name='Arjun' where id=101");
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Updated Successfully...");
			}
			else {
				System.out.println("Updated Failed...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
