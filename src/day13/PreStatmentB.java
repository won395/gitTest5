package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreStatmentB {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public void preStatementB() {
		try {
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String user = "cyci";
			String pw = "1234";
			conn = DriverManager.getConnection(url, user, pw);	// 기본 에러.
			System.out.println("연결 성공");
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	//employ - 부서정보 불러오기
	public static void main(String[] args) {
		PreStatmentB preStatementB = new PreStatmentB();
		List<DeptVO> list = preStatementB.selectDept();
		
		//출력 forEach
		for(DeptVO li : list) {
			System.out.print(li.getDepartmentId()+"\t");
			System.out.print(li.getDepartmentName()+"\t");
			System.out.print(li.getManagerId()+"\t");
			System.out.print(li.getLocationId()+"\n");
		}
	}
	
	public List<DeptVO> selectDept() {
		preStatementB();
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			//* 사용도 jdbc는 최대한 피해주셔야 합니다.
			String sql = "select department_id, department_name, manager_id, location_id FROM departments";
			
			pstmt = conn.prepareStatement(sql);
			
			// ? 있을 경우, pstmt.set~~~
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptVO deptVO = new DeptVO();
				deptVO.setDepartmentId(rs.getInt(1));
				deptVO.setDepartmentName(rs.getString(2));
				deptVO.setManagerId(rs.getInt(3));
				deptVO.setLocationId(rs.getInt(4));
				list.add(deptVO);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { if(rs != null) { rs.close(); } } catch (Exception e) { }
			try { if(pstmt != null) { pstmt.close(); } } catch (Exception e) { }
			try { if(conn != null) { conn.close(); } } catch (Exception e) { }
		}
		
		return list;
	}

}