package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentScore {
	
	Connection conn;
	Statement stat;
	ResultSet rs;
	
	public StudentScore() {
		try {
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			conn = DriverManager.getConnection(url,user,pw);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			
		}
	}	
	public static void main(String[] args) {
		StudentScore studentScore = new StudentScore();
		List<StuSc> list = studentScore.insert();
		// studentScore.insert();
		
		for(StuSc li : list) {
			System.out.println(li.getName());
			System.out.println(li.getKorScore());
			System.out.println(li.getEngScore());
			System.out.println(li.getMathScore());
		}
	}
	
	public List<StuSc> insert() {
		// StudentScore();
		List<StuSc> list = new ArrayList<StuSc>();
		try {
			
			String sql = "update StudentScore set name = ?, korScore = ?, engScore = ?, mathScore = ? where is null";
			stat = conn.prepareStatement(sql);
			
			
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				StuSc stuSc = new StuSc();
				stuSc.setName(rs.getString(1));
				stuSc.setKorScore(rs.getInt(2));
				stuSc.setEngScore(rs.getInt(3));
				stuSc.setMathScore(rs.getInt(4));
				list.add(stuSc);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(stat != null) { stat.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
		return list;
	}
}