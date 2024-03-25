package com.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Insert {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			CallableStatement cstmt = con.prepareCall("call userinsert(104,'Manoj','Civil')");
			int a = cstmt.executeUpdate();
			if(a>0) {
				System.out.println("insert Successfully....");
			}else {
				System.out.println("insert Successfully....");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
