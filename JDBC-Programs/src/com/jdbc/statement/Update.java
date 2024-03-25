package com.jdbc.statement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("update user set name='Nagesh',branch='CSE' where id=101");
			if(result>0) {
				System.out.println("Update Succefully....");
			}else {
				System.out.println("Update NOt Succefully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
