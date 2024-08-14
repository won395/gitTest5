package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementA {
	
	Connection conn;
	Statement stat;
	ResultSet rs;
	
	public StatementA() {
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
		StatementA statementA = new StatementA();
		//statementA.select();
		

		statementA.update();
		
		
	}
	public void select() {
		System.out.println("method 실행");
		// --<= db 주석
		String salary ="10000";
		try {
			stat = conn.createStatement();
			String sql = "select EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES e " + 
			"where salary < " + salary + " and first_name = '이하늬'";
			rs = stat.executeQuery(sql);
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
			stat = conn.createStatement();
			String sql = "update employees set commission_pct = 0.45 where commission_pct  is null";
			
			int rowSuc = stat.executeUpdate(sql);
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

