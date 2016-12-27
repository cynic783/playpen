package com.lewis73.playpen.jdbc;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name from animal")) {
            System.out.println(conn);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    }
}
