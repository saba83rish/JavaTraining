package com.two95.jdbc;

import java.sql.*;

/**
 * Isolation Test For JDBC
 * @author Sujit Chapter 11 Summary JDBC Page #8
 * 
 */
public class IsolationTest {
	public static void main(String args[]) {
		checkIsolation();
	}

	private static void checkIsolation() {
		Connection con = null;
		try {
			String url = "com.two95.jdbc:oracle:thin:SYSTEM/Passw0rd@localhost:1521:orcl";
			con = DriverManager.getConnection(url);
			System.out.println(con);
			
			if (con.getTransactionIsolation() == Connection.TRANSACTION_READ_COMMITTED) {
				System.out.println("MYSQL database addresses DIRTY READS ONLY");
			} else if (con.getTransactionIsolation() == Connection.TRANSACTION_REPEATABLE_READ) {
				System.out.println("MYSQL database addresses DIRTY READS and REPEATABLE READS ONLY");
			} else if (con.getTransactionIsolation() == Connection.TRANSACTION_SERIALIZABLE) {
				System.out.println("MYSQL database addresses DIRTY READS, REPEATABLE READS and PHANTOM READS.Good");
			} else if (con.getTransactionIsolation() == Connection.TRANSACTION_READ_UNCOMMITTED) {
				System.out.println("MYSQL database does not address anything.");
			}
			// Most of the databases will address all the three problems. So the
			// isolation level will always be 3.
			// But many a times, we want to set our own isolation level. we can
			// use the following to only address "Dirty reads".
			con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

			// Here you do your SQL operations, like creating statements and all
			// that good stuff.OK
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}
	}
}
