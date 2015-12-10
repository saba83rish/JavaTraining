package com.two95.jdbc;

import java.sql.*;

/**
 * Chapter 11 JDBC API JDBC Page #293
 * 
 * @author Sujit
 *
 */
public class ReadData {
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet records = null;

	public static void main(String args[]) throws Exception {
		readData();
	}

	private static void readData() throws Exception {
		// Create the SQL
		String sql = "SELECT * FROM CUSTOMERS";
		
		// Get the connection using our utils.
		con = DBUtils.getConnection();
		
		if (con != null) {
			// Create statement from connection
			stmt = con.createStatement();
			
			// Execute the statement by passing the sql.
			records = stmt.executeQuery(sql);
			
			// Iterate over all the returned records
			while (records.next()) {
				String firstName = records.getString(1);
				String middleName = records.getString(2);
				String lastName = records.getString(3);
				int age = records.getInt(4);
				int ssn = records.getInt(5);
				String city = records.getString(6);
				String state = records.getString(7);
				String country = records.getString(8);
				System.out.println(firstName + " ," + middleName + " ," + lastName + " ," + age + " ," + ssn + " ,"
						+ city + " ," + state + " ," + country);
			} // End of While
			DBUtils.closeConnection();
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}