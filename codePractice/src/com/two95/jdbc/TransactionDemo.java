package com.two95.jdbc;

import java.sql.*;

/**
 * Chapter 11 Database Transactions JDBC Page #302
 * 
 * @author Sujit
 *
 */
public class TransactionDemo {
	public static void main(String args[]) {
		try {
			openJointAccount();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}
	}

	private static void openJointAccount() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		
		// Create the SQL statements
		String sql1 = "INSERT INTO Customers VALUES('Customer1','A','Smith',11,12345,'Columbus','OH','USA')";
		String sql2 = "INSERT INTO Customers VALUES(    'Name1','A','Smith',12,12345,'Columbus','OH','USA')";
		
		// Get the connection using our utils.
		conn = DBUtils.getConnection();
		
		if (conn != null) {
			// Create statement from connection
			stmt = conn.createStatement();
			
			// Reset the transaction
			conn.setAutoCommit(false);
			
			// Execute the SQL's
			int status1 = stmt.executeUpdate(sql1);
			int status2 = stmt.executeUpdate(sql2);
			
			if (status1 != -1 && status2 != -1) {
				System.out.println("Joint account created SUCCESSFULLY !!!.");
				conn.commit();
			} else {
				System.out.println("Something went wrong! Rolled back the transaction.");
				conn.rollback();
			}
			conn.close();
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}