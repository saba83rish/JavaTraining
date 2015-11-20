package com.two95.jdbc;
import java.sql.*;

public class ConnectionTest {

	public static void main(String args[]) {
		try {
			// Step 1: Load the Driver
//	MySQL Driver		Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step 2: Get the connection by passing the URL
//	MySQL Connection			String url = "com.two95.jdbc:mysql://localhost:3306/MyDB";
			String url = "com.two95.jdbc:oracle:thin:SYSTEM/Passw0rd@localhost:1521:orcl";
			Connection con = DriverManager.getConnection(url);
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
