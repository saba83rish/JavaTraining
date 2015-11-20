package com.two95.jdbc;

import java.sql.*;


/**
 * @author Sujit
 * This Class Connects to a Database ('orcl' instance of Oracle in this case)
 * and Creates a Table called 'CUSTOMERS' in it.
 *
 */
public class CreateTableVendors {
	
	public static void main(String args[]) throws Exception {
		createTable();
	}

	private static void createTable() throws Exception {
		// Create the DDL
		String sql = "CREATE TABLE VENDORS"
			+ "("
				+ "VENDOR_ID VARCHAR(5),"
				+ "FIRSTNAME VARCHAR(50),"
				+ "MIDDLENAME VARCHAR(2),"
				+ "LASTNAME VARCHAR(50),"
				+ "AGE NUMERIC(2),"
				+ "SSN NUMERIC(10),"
				+ "CITY VARCHAR(32),"
				+ "STATE VARCHAR(2),"
				+ "COUNTRY VARCHAR(40)"
			+ ")";
		
		// Get the connection using our utils...
		Connection con = DBUtils.getConnection();
		if (con != null) {
			// Create statement from connection
			Statement stmt = con.createStatement();
			
			// Execute the statement by passing the sql
			int result = stmt.executeUpdate(sql);
			
			if (result != -1) {
				System.out.println("Table created sucessfully.");
			} else {
				System.out.println("Could'nt create table! Please check your SQL syntax.");
			}
			// Close the statements and Connections
			stmt.close();
			DBUtils.closeConnection();
		} else {
			System.out.println("Unable to get the connection!!!");
		}
	}

}
