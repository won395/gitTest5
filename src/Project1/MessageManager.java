package Project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageManager {
    public void addMessage(String username, String message) {
        String sql = "INSERT INTO messages(username, message) VALUES(?, ?)";

        try (Connection conn = ChatData.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, message);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getMessages() {
        StringBuilder messages = new StringBuilder();
        String sql = "SELECT username, message, timestamp FROM messages ORDER BY timestamp DESC";

        try (Connection conn = ChatData.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String username = rs.getString("username");
                String message = rs.getString("message");
                String timestamp = rs.getString("timestamp");

                messages.append("[").append(timestamp).append("] ").append(username).append(": ").append(message).append("\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return messages.toString();
    }
}
