package day13;

import java.sql.Connection;
import java.sql.DriverManager;

//jdbc <= java하고 db connect
//java(프로젝트 pc) = 네트워크(방화벽) = db
public class StudyDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//db 무엇을 연겨하느냐에 따라서
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(url,user,pw);
			
			System.out.println("연결확인하기");
			
			if(conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(url, user, pw);
				System.out.println("체크");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
