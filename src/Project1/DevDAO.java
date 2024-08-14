package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DevDAO {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
        String user = "root";
        String pw = "1234";
        String sql = "CREATE TABLE IF NOT EXISTS messages (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "username TEXT NOT NULL," +
                     "message TEXT NOT NULL," +
                     "timestamp DATETIME DEFAULT CURRENT_TIMESTAMP" +
                     ");";
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}