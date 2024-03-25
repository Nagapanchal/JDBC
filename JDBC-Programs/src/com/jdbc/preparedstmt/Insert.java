package com.jdbc.preparedstmt;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		
	
	try {
	Driver driver = new com.mysql.cj.jdbc.Driver();
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
	PreparedStatement pstmt = con.prepareStatement("insert into user values (?,?,?)");
	pstmt.setInt(1, 103);
	pstmt.setString(2, "Raghu");
	pstmt.setString(3, "CSE");
	
	int result = pstmt.executeUpdate();
	if(result>0) {
		System.out.println("Inserted Successfully...");
	}
	else {
		System.out.println("Inserted Failed...");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}
}
