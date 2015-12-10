package com.two95.jdbc;

import java.io.*;
import java.sql.*;
import java.util.StringTokenizer;

/**
 * Chapter 11 JDBC API JDBC Page 291
 * 
 * @author Sujit
 *
 */
public class InsertRecord {
	static int recordsInserted = 0;
	public static void main(String args[]) throws Exception {
		BufferedReader bufferedReader = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
					"C:\\Users\\Sujit\\Documents\\workspace-sts-3.7.0.RELEASE\\codePractice\\src\\com.two95.jdbc\\Data.txt")));
		// Read line by line from the file
		while (true) {
			// Read the record line
			String line = bufferedReader.readLine();
			// End of file, then break out of the loop.
			if (line == null) {
				break;
			}
			// Otherwise, parse the line
			StringTokenizer st = new StringTokenizer(line, ",");
			String firstName = st.nextToken();
			String middleName = st.nextToken();
			String lastName = st.nextToken();
			String age = st.nextToken();
			String ssn = st.nextToken();
			String city = st.nextToken();
			String state = st.nextToken();
			String country = st.nextToken();
			String sql = "INSERT INTO CUSTOMERS VALUES(" + " '" + firstName + "' , " + " '" + middleName + "' , "
					+ " '" + lastName + "' , " + age + " , " + ssn + " , " + " '" + city + "' , " + " '" + state
					+ "' , " + " '" + country + "')";
			System.out.println("sql = " + sql);

			// Pass the sql to JDBC method
			insertCustomer(sql);
		} // End of while loop
		bufferedReader.close();
	}

	private static void insertCustomer(String sql) throws Exception {

		// Get the connection using our utils.;
		Connection con = DBUtils.getConnection();
		if (con != null) {
			// Create statement from connection
			Statement stmt = con.createStatement();
			// Execute the statement by passing the sql
			int result = stmt.executeUpdate(sql);
			if (result != -1) {
				recordsInserted += result;
				System.out.println("Inserted Record #" + recordsInserted + "(s) successfully");
			} else {
				System.out.println("Unable to insert record. Please check your SQL syntax");
			}
			// Close the statements and Connections
			stmt.close();
			DBUtils.closeConnection();
			System.out.println("Inserted Total " + recordsInserted + " Record(s) successfully, Wohoo!");
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}