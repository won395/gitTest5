package day14;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoA {

	public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "1234";
            Connection conn = DriverManager.getConnection(url, user, pw);

            System.out.println("연결 확인하기");

						//연결 실패 시, 다시 재 연결
            if(conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, pw);
                System.out.println("체크");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}