package test02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NoticeDAO02 {
    public void addNotice(String title, String content) throws SQLException {
        String sql = "INSERT INTO posts (title, content) VALUES (?, ?)";
        try (Connection conn = Database02.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.executeUpdate();
        }
    }

    public void updateNotice(int id, String title, String content) throws SQLException {
        String sql = "UPDATE posts SET title = ?, content = ?, date = CURRENT_TIMESTAMP WHERE id = ?";
        try (Connection conn = Database02.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        }
    }

    public void deleteNotice(int id) throws SQLException {
        String sql = "DELETE FROM posts WHERE id = ?";
        try (Connection conn = Database02.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    public List<Notice02> getAllNotices() throws SQLException {
        List<Notice02> notices = new ArrayList<>();
        String sql = "SELECT * FROM posts";
        try (Connection conn = Database02.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Notice02 notice = new Notice02();
                notice.setId(rs.getInt("id"));
                notice.setTitle(rs.getString("title"));
                notice.setContent(rs.getString("content"));
                notice.setDate(rs.getTimestamp("date"));
                notices.add(notice);
            }
        }
        return notices;
    }

    public Notice02 getNoticeById(int id) throws SQLException {
        Notice02 notice = null;
        String sql = "SELECT * FROM posts WHERE id = ?";
        try (Connection conn = Database02.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    notice = new Notice02();
                    notice.setId(rs.getInt("id"));
                    notice.setTitle(rs.getString("title"));
                    notice.setContent(rs.getString("content"));
                    notice.setDate(rs.getTimestamp("date"));
                }
            }
        }
        return notice;
    }
}
