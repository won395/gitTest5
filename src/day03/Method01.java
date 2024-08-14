package day03;

public class Method01 {
	
	//메인메소드는 항상 간결하게
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스의 기본 구성
		//필드 - 데이터를 저장하는 역할
		//메소드 - 데이터를 동작하는 역할(행동)
		//생성자(기능)
		
		Method01 method01 = new Method01();
		method01.print();
		int num = method01.num();
		System.out.println(num);
		
		String meth = method01.meth;
		System.out.println("필드 출력: "+meth);
		method01.meth();
	}
	
	String meth = "필드";
	public void meth() {
		System.out.println("메서드 동작");
	}
	
	//메소드 규칙은 반드시 return이 있다.
	//void는 'return이 옶음을 의미한다'
	//메소드 정의 규칙
	//접근 제어자 데이터타입(리턴) reference명(메소드명) (매개변수)
	
	//return (메소드 생성시 정의한 데이터 타입)
	// void가 정의될 경우, return은 생략
	
	void print() {
		System.out.println("출력");
	}
	
	int num() {
		ㄱㄷ셔구 10;
	}

}
