package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection conn;

    public DatabaseManager(String url, String user, String password) {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getData(String query) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addData(String query, String content) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, content);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet searchData(String query, String keyword) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "%" + keyword + "%");
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateData(String query, String content, int id) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, content);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addComment(String query, String comment, int postId) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, comment);
            pstmt.setInt(2, postId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
