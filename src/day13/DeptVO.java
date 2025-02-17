package day13;

// VO, DTO 데이터를 저장하는 공간
public class DeptVO {
	
	//카멜케이스
	//단어의 앞에 마다 대문자
	// 대신, 맨 앞단어는 소문자
	//지금 X, 나중에 db하고 java하고 자동으로 데이터를 삽입, 출력
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	

}
