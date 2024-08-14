package Board;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dataconn {
    private static final String url = "jdbc:mysql://114.70.127.232:3306/blue_iscream?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String user = "won";
    private static final String pw = "1234";

    static {
        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC 드라이버를 찾을 수 없습니다.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pw);
    }

    public static int createFile(String filePath) throws SQLException {
        String sql = "INSERT INTO files(file_path) VALUES (?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, filePath);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // 생성된 file_id 반환
            } else {
                throw new SQLException("파일 생성 실패");
            }
        }
    }
    
    public static void createInquiry(String title, String content, Timestamp createdAt, int fileId) throws SQLException {
        String sql = "INSERT INTO inquiries (title, content, created_at, file_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setTimestamp(3, createdAt);
            if (fileId == -1) {
                pstmt.setNull(4, Types.INTEGER);
            } else {
                pstmt.setInt(4, fileId);
            }
            pstmt.executeUpdate();
        }
    }

    public static void createPost(int userId, int chatroomId, String content, String title, Timestamp createdAt, boolean isDelete, Timestamp editDate, int file, boolean isNotice) throws SQLException {
        String sql = "INSERT INTO posts(user_id, chatroom_id, content, title, created_at, is_delete, edit_date, file, is_notice) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setInt(2, chatroomId);
            pstmt.setString(3, content);
            pstmt.setString(4, title);
            pstmt.setTimestamp(5, createdAt);
            pstmt.setBoolean(6, isDelete);
            pstmt.setTimestamp(7, editDate);
            pstmt.setInt(8, file);
            pstmt.setBoolean(9, isNotice);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deletePost(int postId) throws SQLException {
        String sql = "DELETE FROM posts WHERE post_id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, postId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static List<Post> getAllPosts() throws SQLException {
        String sql = "SELECT * FROM posts";
        List<Post> posts = new ArrayList<>();
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int postId = rs.getInt("post_id");
                int userId = rs.getInt("user_id");
                int chatroomId = rs.getInt("chatroom_id");
                String content = rs.getString("content");
                String title = rs.getString("title");
                Timestamp createdAt = rs.getTimestamp("created_at");
                boolean isDelete = rs.getBoolean("is_delete");
                Timestamp editDate = rs.getTimestamp("edit_date");
                int file = rs.getInt("file");
                boolean isNotice = rs.getBoolean("is_notice");

                if (content == null) content = "";
                if (title == null) title = "";
                if (createdAt == null) createdAt = new Timestamp(System.currentTimeMillis());
                if (editDate == null) editDate = new Timestamp(System.currentTimeMillis());

                Post post = new Post(postId, userId, chatroomId, content, title, new java.util.Date(createdAt.getTime()), isDelete, new java.util.Date(editDate.getTime()), String.valueOf(file), isNotice);
                posts.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return posts;
    }

    public static void updatePost(int postId, int userId, int chatroomId, String content, String title, Timestamp createdAt, boolean isDelete, Timestamp editDate, int file, boolean isNotice) throws SQLException {
        String sql = "UPDATE posts SET user_id = ?, chatroom_id = ?, content = ?, title = ?, created_at = ?, is_delete = ?, edit_date = ?, file = ?, is_notice = ? WHERE post_id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setInt(2, chatroomId);
            pstmt.setString(3, content);
            pstmt.setString(4, title);
            pstmt.setTimestamp(5, createdAt);
            pstmt.setBoolean(6, isDelete);
            pstmt.setTimestamp(7, editDate);
            pstmt.setInt(8, file);
            pstmt.setBoolean(9, isNotice);
            pstmt.setInt(10, postId);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("게시물 업데이트에 실패했습니다: 대상 게시물이 존재하지 않습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

	public static List<String> getAllInquiries() throws SQLException {
		String sql = "SELECT title, content FROM posts";  //게시판, 문의사항 둘다 posts 중복으로 쓰니까 겹침 
        List<String> inquiries = new ArrayList<>();
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String title = rs.getString("title");
                String content = rs.getString("content");
                inquiries.add("제목: " + title + " \n내용: " + content);
            }
        }
        return inquiries;
    }
}