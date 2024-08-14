package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChatData {
    static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
        String user = "root";
		String pw = "1234";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pw);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
		
    }

    public void addMessage(String username, String message) {
        String sql = "INSERT INTO messages(username, message) VALUES(?, ?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, message);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteMessage(int id) {
        String sql = "DELETE FROM messages WHERE id = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

