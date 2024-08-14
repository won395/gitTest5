package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementA_PRE {
	
	Connection conn;
	Statement stat;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public StatementA_PRE() {
		// TODO Auto-generated constructor stub
		try {
			
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			conn = DriverManager.getConnection(url,user,pw);
		}catch(Exception e){
			
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatementA_PRE statementA = new StatementA_PRE();
		statementA.select();
		

		//statementA.update();
		
		
	}
	public void select() {
		System.out.println("method 실행");
		// --<= db 주석
		String salary ="10000";
		String serchName = "이하늬";
		try {
			
			String sql = "select EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES e " + 
			"where salary < ? and first_name = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, salary);
			pstmt.setString(2, serchName);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//int id = rs.getInt(EMPLOYEE_ID);
				//String name = rs.getString(FIRST_NAME);
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("ID " + id + ", Name: "+ name);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try { if(rs != null) {rs.close();} } catch (Exception e) { }
			try { if(stat != null) {stat.close();} }catch (Exception e) { }
			try { if(conn != null) {stat.close();} }catch (Exception e) { }
		}
	}
	
	public void update() {
		System.out.println("method 실행");
		// --<= db 주석
		String salary = "10000";
		try {
			
			String sql = "update employees set commission_pct = 0.45 where commission_pct  is null";
			pstmt = conn.prepareStatement(sql);
			
			int rowSuc = pstmt.executeUpdate();
			System.out.println("성공 행의 개수: "+rowSuc);
			
			if(rowSuc != 0) {
				System.out.println("성공");
			}else if(rowSuc == 0) {
				System.out.println("실패");
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try { if(stat != null) {stat.close();} }catch (Exception e) { }
			try { if(conn != null) {stat.close();} }catch (Exception e) { }
		}
	}

}

