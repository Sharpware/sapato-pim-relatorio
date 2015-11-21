package com.sharpware.sapato.pim.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sharpware", "root", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

