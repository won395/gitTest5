package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void StudentDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			conn = DriverManager.getConnection(url, user, pw);	// 기본 에러.
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StudentDAO dao = new StudentDAO();
//		//List<StuVO> list = dao.select();
//		dao.update("호크아이", 70, 70, 70);
//		
//		
////		for(StuVO li : list) {
////			System.out.print(li.getName()+"\t");
////			System.out.print(li.getKorScore()+"\t");
////			System.out.print(li.getEngScore()+"\t");
////			System.out.print(li.getMathScore()+"\n");
////		}
//		
//		
//	}
	
	public void insert(String name, int korScore, int engScore, int mathScore) {
		StudentDAO();
		int result = 0;
		try {
			String sql = "insert into StuScore values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setInt(2, korScore);
			pstmt.setInt(3, engScore);
			pstmt.setInt(4, mathScore);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(pstmt != null) { pstmt.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
	}
	
	public List<StuVO> select(){
		StudentDAO();
		List<StuVO> list = new ArrayList<StuVO>();
		try {
			
			String sql = "select name, korScore, engScore, mathScore from StuScore";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StuVO stuVO = new StuVO();
				String name = rs.getString(1);
				int korScore = rs.getInt(2);
				int engScore = rs.getInt(3);
				int mathScore = rs.getInt(4);
				
				stuVO.setName(name);
				stuVO.setKorScore(korScore);
				stuVO.setEngScore(engScore);
				stuVO.setMathScore(mathScore);
				list.add(stuVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(pstmt != null) { pstmt.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
		
		return list;
	}
	
	public void update(String name, int korScore, int engScore, int mathScore) {
		StudentDAO();
		
		try {
			String sql = "update stuscore set korScore = ? , engScore = ?  , mathScore = ? where name = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, korScore);
			pstmt.setInt(2, engScore);
			pstmt.setInt(3, mathScore);
			pstmt.setString(4, name);
			
			 int result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(pstmt != null) { pstmt.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
	}
	
	public void delect(String name) {
		StudentDAO();
		int result = 0;
		try {
			String sql = "delete from stuscore where name = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(pstmt != null) { pstmt.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
	}
	
	
	

}


