package com.jdbc.statement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into user values(102,'Mahesh','IT')");
			if(result>0) {
				System.out.println("Insert SuccessFully..");
			}else {
				System.out.println("Insert NOT SuccessFully..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
