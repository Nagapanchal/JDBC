package com.jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Update {

	public static void main(String[] args) {
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/naga?user=root&password=root");
			CallableStatement cstmt = con.prepareCall("call userupdate(102,'mahantesh','ME')");
			int res = cstmt.executeUpdate();
			if(res>0) {
				System.out.println("Update SuccessFully....");
			}
			else {
				System.out.println("Update Failed....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
