package day10;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//공통된 것 끼리 모이는 것이 OOP의 장점
		//String, int => 데이터 타입 (객체) => class
		
		//컬랙션
		//기본타입 x => int, char, boolean

	}

}

//데이터를 저장하고 받는것은 vo로 정의 (Value Object)
// VO는 캡슐화 필드는 private으로 직접 접근 할수 없도록 정의
//필드(변수)는 기억,메소드 행동
class Stu {
	String name;
	private int num;
	private int phone;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}