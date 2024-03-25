package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Select {

	public static void main(String[] args) {

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from user");
			while(result.next()) {
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				System.out.println(result.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
