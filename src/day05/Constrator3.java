package day05;

public class Constrator3 {
	
	//1. 필드 위치
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//2. 필드 바로 아해가 생성자
	//생성자 없는게 아님
	public Constrator3() {
		this("홍길동", 100, 90, 80);
	}
	
	public Constrator3(String name, int kor, int eng, int math) {
		//변수의 우선 순위는 가까운 괄호에 선언된 변수
		//변수 명이치이 같을떄 메소드에서 선언돤 변수와 클래스에서 선언된 변수중
		//*this는 해당 클래스를 가리킨다*
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//생성자 아랫부분이 메소드 정의 공간
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constrator3 c1 = new Constrator3();
		System.out.println(c1.getMath());
		
		Constrator3 c2 = new Constrator3()
		
		

	}

}

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}