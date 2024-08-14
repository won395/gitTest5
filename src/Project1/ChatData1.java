package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChatData1 {
    private static final String URL = "jdbc:mysql://localhost:3306/chatdb?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

