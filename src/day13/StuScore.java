package day13;

import java.sql.*;
import java.util.*;

public class StuScore {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public StuScore() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, user, pw);
            System.out.println("연결 성공");
        } catch (SQLException e) {
            System.out.println("연결 실패: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StuScore stuScore = new StuScore();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Scanner sc = new Scanner(System.in);
            int num;

            do {
                // System.out.println("[0] 테이블 생성");
                System.out.println("[1] 데이터 추가");
                System.out.println("[2] 데이터 삭제");
                System.out.println("[3] 데이터 변경");
                System.out.println("[4] 데이터 조회");
                System.out.println("[5] 종료");
                System.out.print("번호 입력 : ");
                num = sc.nextInt();

                switch (num) {
                /*
                    case 1:
                        stuScore.createTable(); 테이블 추가 했으니 필요 없어
                        break;
                        */
                    case 1:
                        stuScore.insertData(); // 데이터 삽입
                        break;
                    case 2:
                        stuScore.removeData(); // 데이터 삭제
                        break;
                    case 3:
                        stuScore.changeData(); // 데이터 수정
                        break;
                    case 4:
                        stuScore.viewData(); // 데이터 조회
                        break;
                    case 5:
                        System.out.println("종료");
                        break;
                    default:
                        System.out.println("잘못된 입력 다시 시도하시오");
                }
            } while (num != 5);

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (stuScore.pstmt != null) stuScore.pstmt.close();
                if (stuScore.conn != null) stuScore.conn.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    /* 테이블 생성 이미 테이블을 생성했으니까 여기도 필요없다
    public void createTable() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS StuScore (name VARCHAR(50) NOT NULL, korScore INT, engScore INT, mathScore INT)";
            pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("테이블 생성 성공!");
        } catch (Exception e) {
            System.out.println("테이블 생성 실패 이유 : " + e.toString());
        }
    }
	*/
    // 데이터 삽입
    public void insertData() {
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

    // 데이터 삭제
    public void removeData() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("삭제할 이름 입력: ");
            String name = sc.nextLine();

            String removeStr = "DELETE FROM StuScore WHERE name=?";
            pstmt = conn.prepareStatement(removeStr);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("데이터 삭제 성공!");
        } catch (Exception e) {
            System.out.println("데이터 삭제 실패 이유 : " + e.toString());
        }
    }

    // 데이터 수정
    public void changeData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("변경할 학생 이름 입력: ");
            String oldName = sc.nextLine();
            System.out.print("새 이름 입력: ");
            String newName = sc.nextLine();
            
            String oldKor = sc.nextLine();
            System.out.print("새 국어점수 입력: ");
            String newKor = sc.nextLine();
            
            String oldEng = sc.nextLine();
            System.out.print("새 영어점수 입력: ");
            String newEng = sc.nextLine();
            
            String oldMath = sc.nextLine();
            System.out.print("새 수학점수 입력: ");
            String newMath = sc.nextLine();

            String changename = "UPDATE StuScore SET name=? WHERE name=?";
            pstmt = conn.prepareStatement(changename);
            pstmt.setString(1, newName);
            pstmt.setString(2, oldName);
            pstmt.executeUpdate();
            
            String changekor = "UPDATE StuScore SET korScore=? WHERE korScore=?";
            pstmt = conn.prepareStatement(changename);
            pstmt.setString(1, newKor);
           pstmt.setString(2, oldKor);
            pstmt.executeUpdate();
            
            String changeeng = "UPDATE StuScore SET engScore=? WHERE engScore=?";
            pstmt = conn.prepareStatement(changeeng);
            pstmt.setString(1, newEng);
            //pstmt.setString(2, oldEng);
            pstmt.executeUpdate();
            
            String changemath = "UPDATE StuScore SET mathScore=? WHERE mathScore=?";
            pstmt = conn.prepareStatement(changemath);
            pstmt.setString(1, newMath);
            //pstmt.setString(2, oldMath);
            pstmt.executeUpdate();
            
            
            
            System.out.println("데이터 변경 성공!");
        } catch (Exception e) {
            System.out.println("데이터 변경 실패 이유 : " + e.toString());
        }
    }

    // 데이터 조회
    public void viewData() {
        try {
            String viewStr = "SELECT * FROM StuScore";
            pstmt = conn.prepareStatement(viewStr);
            rs = pstmt.executeQuery();
            System.out.println("============= 테이블 조회 =============");
            while (rs.next()) {
                System.out.print(rs.getString("name") + "\t" + rs.getInt("korScore")
                        + "\t" + rs.getInt("engScore") + "\t" + rs.getInt("mathScore") + "\n");
            }
            System.out.println("=========== 데이터 조회 성공 ===========");
        } catch (Exception e) {
            System.out.println("데이터 조회 실패 이유 : " + e.toString());
        }
    }
}