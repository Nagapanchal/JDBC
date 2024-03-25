package com.jdbc.statement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("delete from user where id=100");
			if(result>0) {
				System.out.println("Deleted Successfully..");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
