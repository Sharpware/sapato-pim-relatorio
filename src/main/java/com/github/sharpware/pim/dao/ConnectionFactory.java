package com.github.sharpware.pim.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/sharpware", "root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
