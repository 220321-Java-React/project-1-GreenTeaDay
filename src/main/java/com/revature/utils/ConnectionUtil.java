package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException {
		try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("Driver not located.");
	}
		String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=\"public\"";
		String usernames = "postgres";
		String passwords = "WTCANTFW";

		return DriverManager.getConnection(url, usernames, passwords);
		}

	};