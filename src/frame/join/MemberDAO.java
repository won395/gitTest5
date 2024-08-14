package frame.join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void joinAcces() {
		try {
            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, user, pw);
            
            if(conn != null) {
            	System.out.println("연결 성공");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public int memberInsert(String name, String pw, String email) {
		joinAcces();
		int result = 0;
		try {
			String sql = "insert into FRAME_MEMBER values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			pstmt.setString(3, email);
			
			result = pstmt.executeUpdate();
			System.out.println("실행결과: "+result);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			//여기서 에러가 발생 된 것을 확인하고 싶다.
			result = -1;
		}
		finally {
			try { if(pstmt != null) pstmt.close(); } catch (Exception e) {	}
			try { if(conn != null) pstmt.close(); } catch (Exception e) {	}
		}
		return result;
	}

	//중복체크 이기 때문에, return 값이 list 일 필요 없다.
	public int selectNameCheck(String name) {
		joinAcces();
		int resultCnt = 0;
		
		try {
			String sql = "select COUNT(*) from FRAME_MEMBER where NAME = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			//if 사용하나요, while
			if(rs.next()) {
				resultCnt = rs.getInt(1);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { if(rs != null) rs.close(); } catch (Exception e) {	}
			try { if(pstmt != null) pstmt.close(); } catch (Exception e) {	}
			try { if(conn != null) pstmt.close(); } catch (Exception e) {	}
		}
		
		return resultCnt;
	}
	
	public boolean login(String name, String pw) {
		joinAcces();
		boolean login = false;
		try {
			String sql = "select password from FRAME_MEMBER where NAME = ?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if (rs.getString(1).equals(pw)) {
				login = true;
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {if (pstmt != null) pstmt.close();}catch (Exception e) {}
			try {if (conn != null) conn.close();}catch (Exception e) {}
			try {if (rs != null) rs.close();}catch (Exception e) {}
			
		}
		return login;
	}

	
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		//memberDAO.joinAcces();
		//memberDAO.memberInsert("아이언맨", "1234", "ion@naver.com");
		System.out.println(memberDAO.selectNameCheck("슈퍼맨"));
	}
}