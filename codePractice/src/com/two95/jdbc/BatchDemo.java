package com.two95.jdbc;

import java.sql.*;

/**
 * Chapter 11 Database Transactions JDBC 300
 * 
 * @author Sujit
 *
 */
public class BatchDemo {
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String args[]) {
		try {
			runAsBatch();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}
	}

	private static void runAsBatch() throws Exception {
		// Create the SQLs
		String sql1 = "INSERT INTO Customers" + "VALUES('Customer1','A','Smith',11,12345,'Columbus','OH','USA')";
		String sql2 = "INSERT INTO Customers" + "VALUES(    'Name1','A','Smith',12,12345,'Columbus','OH','USA')";
		String sql3 = "INSERT INTO Customers" + "VALUES(    'Name2','A','Smith',13,12345,'Columbus','OH','USA')";
		String sql4 = "INSERT INTO Customers" + "VALUES(    'Name3','A','Smith',14,12345,'Columbus','OH','USA')";
		String sql5 = "INSERT INTO Customers" + "VALUES(    'Name4','A','Smith',15,12345,'Columbus','OH','USA')";
		String sql6 = "INSERT INTO Customers" + "VALUES(    'Name5','A','Smith',16,12345,'Columbus','OH','USA')";
		// Get the connection using our utils.
		con = DBUtils.getConnection();
		if (con != null) {
			// Create statement from connection
			stmt = con.createStatement();
			// Add the SQL's to the Batch
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.addBatch(sql4);
			stmt.addBatch(sql5);
			stmt.addBatch(sql6);
			// Run the batch
			int[] status = stmt.executeBatch(); // <<< java.sql.BatchUpdateException: error occurred during batching: ORA-00928: missing SELECT keyword ???
			for (int i = 0; i < status.length; i++) {
				if (status[i] != -1) {
					System.out.println("Processed SQL SUCCESSFULLY Status[" + i + "] = " + status[i]);
				} else {
					System.out.println("Something went wrong...");
				}
			}
			con.close();
		} else {
			System.out.println("Unable to get the connection!!!");
		}
	}
}