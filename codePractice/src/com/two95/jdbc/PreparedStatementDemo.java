package com.two95.jdbc;

import java.sql.*;

/**
 * Chapter 11 JDBC API JDBC Page #297
 * 
 * @author Sujit
 * 
 */
public class PreparedStatementDemo {
	public static void main(String args[]) throws Exception {
		// Pass the data to the method.
		insertCustomer("Brian", "B", "Smith", 20, 123456789, "Columbus", "OH", "USA");
	}

	private static void insertCustomer(String firstName, String middleName, String lastName, int age, int ssn,
			String city, String state, String country) throws Exception {
		PreparedStatement ps = null;
		// Create the SQL
		String sql = "INSERT INTO CUSTOMERS VALUES (?,?,?,?,?,?,?,?)"; // Removed ; from the end of SQL statement...
		// Get the connection using our utils...
		Connection con = DBUtils.getConnection();
		if (con != null) {
			// Create statement from connection
			ps = con.prepareStatement(sql);
			// Populate the data
			ps.setString(1, firstName);
			ps.setString(2, middleName);
			ps.setString(3, lastName);
			ps.setInt(4, age);
			ps.setInt(5, ssn);
			ps.setString(6, city);
			ps.setString(7, state);
			ps.setString(8, country);
			System.out.println("prepareStatement = '" + ps.toString() );
			System.out.println("prepareStatement = '" + ps );
			
			// Execute the prepared statement
			int result = ps.executeUpdate(); // Exception in thread "main" java.sql.SQLSyntaxErrorException: ORA-00911: invalid character ???
			if (result != -1) {
				System.out.println("Inserted " + result + " Record(s) Successfully into Customers Table!");
			} else {
				System.out.println("Unable to insert record. Please check your SQL syntax...");
			}
			// Close the statements and Connections
			ps.close();
			DBUtils.closeConnection();
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}