package com.two95.jdbc;

import java.sql.*;

public class DBUtils {
	static Connection con;
	static String jdbcDriverPath = "oracle.jdbc.driver.OracleDriver";
			// >>> for MySQL Database >>> "com.mysql.jdbc.Driver"...
	// Static block to load the driver just once
	static {
		try {
			// Step 1: Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//>>> for Oracle Database >>> "oracle.jdbc.driver.OracleDriver"...
			// >>> for MySQL Database >>> "com.mysql.jdbc.Driver"...
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to load the Driver! Please check your Classpath >> '" 
					+ jdbcDriverPath + "'");
		}
	}

	public static Connection getConnection() {
		// Step 2: Get the connection by passing the URL
		String url = "com.two95.jdbc:oracle:thin:SYSTEM/Passw0rd@localhost:1521:orcl";
		// >>> for MySQL Database >>> "com.two95.jdbc:mysql://localhost:3306/MyDB";
		//>>> for Oracle Database >>> "com.two95.jdbc:oracle:thin:SYSTEM/Passw0rd@localhost:1521:orcl"
		try {
			con = DriverManager.getConnection(url);
			System.out.println(con);
//			System.out.println("Retrieves this Connection object's current schema name is =" + con.getSchema());
		} catch (Exception e) {
			System.out.println("Unable to get connection! Please check your connection URL >> '" + url + "'");
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection() {
		try {
			// Step 7: Close the connection.
			con.close();
		} catch (Exception e) {
			System.out.println("Failed to close the connection!");
		}
	}

}
