package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentScoreDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public StudentScoreDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, user, pw);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<StuSc> getStudentScores() {
        List<StuSc> list = new ArrayList<>();
        try {
            String sql = "SELECT name, korScore, engScore, mathScore FROM student_scores";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StuSc stuSc = new StuSc();
                stuSc.setName(rs.getString("name"));
                stuSc.setKorScore(rs.getInt("korScore"));
                stuSc.setEngScore(rs.getInt("engScore"));
                stuSc.setMathScore(rs.getInt("mathScore"));
                list.add(stuSc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
        return list;
    }
    
    void insertData() { //값 입력
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("이름 입력: ");
            String name = sc.nextLine();

            System.out.print("국어 점수 입력: ");
            int korScore = sc.nextInt();

            System.out.print("영어 점수 입력: ");
            int engScore = sc.nextInt();

            System.out.print("수학 점수 입력: ");
            int mathScore = sc.nextInt();

            String sql = "INSERT INTO StuScore (name, korScore, engScore, mathScore) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, korScore);
            pstmt.setInt(3, engScore);
            pstmt.setInt(4, mathScore);
            pstmt.executeUpdate();

            System.out.println("데이터 추가 성공!");
        } catch (Exception e) {
            System.out.println("데이터 추가 실패 이유 : " + e.toString());
        }
    }
}