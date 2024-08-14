package day13;

public class Study02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DataVO(); //인스턴스화 (추상적인 것) 

	}

}

//class
//클래스마다 사용하는 이유(역할)이 존재
//VO <= Value Object 데이터를 저앚하는 역항
// 모든변수는 private: 외부에서 접근 불가능하게 함
// 대신 메서드로 변수를 입력, 출력,게터,세터










class DataVO {
	String name = "짱구"; //필드, 인스턴스(추상적인 것을 명시적으로 변경) 변수
	//접근제어자 리턴타입 메소드명(메소드 메개변수 (아규먼트))
	public void print() {
		String name = "홍길동"; //메개변수
		//메소드안에서는 메개변수가 우선순위
		System.out.println(name); // 홍길동
		System.out.println(this.name); //짱구
		
		//this는 자기자신(Class)
		//this.name <= class가 갖고있는 변수 name
		
		//메개변수는 메소드가 종료될떄 사라짐 (생명 주기)
		
	}
	
	//오바로딩
	//메서드, 생성자 둘다 적용
	//메서드명이 동일할때 이 명칭을 또 사용하고싶다 할때
	//1.메게변수 갯수가 다를떄
	//2.
	//3.

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}