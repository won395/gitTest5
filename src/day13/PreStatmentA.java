package day13;

import java.sql.*;

public class PreStatmentA {
	
	Connection conn;
	Statement stat;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	public PreStatmentA() {
		try {
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			conn = DriverManager.getConnection(url,user,pw); //기본 에러
		} catch (SQLException e) {
			
		}
	}

	public static void main(String[] args) {
		
		PreStatmentA statmentA = new PreStatmentA();
		//statmentA.select();
		statmentA.insert();
	}
	
	public void select() {
		System.out.println("메서드 실행");
		
		String salary = "10000";
		String searchName = "이하늬";
		try {
			
			
			String sql = "select * from employees e "
					+ "where salary < ? and first_name = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, salary);
			pstmt.setString(2, searchName);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("EMPLOYEE_ID"); 			//1번쨰 방법
				String name = rs.getString("FIRST_NAME");
				//int id = rs.getInt(1); 					//2번쨰 방법 이렇게 해도 값은 나온다
				//String name = rs.getString(2);
				System.out.println("ID: "+id + " NAME: "+name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(stat != null) { stat.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
	}
	
	
	public void insert() {
		System.out.println("메서드 실행");
		
		try {
			
			String sql = "update employees set commission_pct = 0.55 "
					+ "where commission_pct is null";
			
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "값");
			
			// 성공행의 갯수
			
			
			int rowSuc = pstmt.executeUpdate(); 
			System.out.println("성공행의 갯수: "+rowSuc);
			
			if(rowSuc != 0) {
				System.out.println("성공");
			} else if(rowSuc == 0) {
				System.out.println("실패");
			}
		
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { if(stat != null) { stat.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
	}
}