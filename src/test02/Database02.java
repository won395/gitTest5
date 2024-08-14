package test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database02 {
    private static final String URL = "jdbc:mysql://192.168.40.33:3306/blue_iscream";
    private static final String USER = "won";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
