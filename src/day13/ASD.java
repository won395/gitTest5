package day13;

import java.sql.Connection;
import java.sql.DriverManager;

public class ASD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(url,user,pw);
			
			System.out.println("연결 확인하기");
			
			if(conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(url,user,pw);
				System.out.println("체크");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
