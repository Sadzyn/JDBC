package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	    String url = "jdbc:mysql://localhost:3306/moviesrental?serverTimezone=" + TimeZone.getDefault().getID();
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "root");
        connectionProperties.put("password", "password");
        try (Connection connection = DriverManager.getConnection(url, connectionProperties)) {
            System.out.println("Nawiązano połączenie");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

























