package day12;

public class AnonyClassA {
	
	//필드 선언
	AnonyB anonyB;
	String name;
	
	AnonyB anonyB2 = new AnonyB() {
		
	};
	
	//매개변수 (메소드 내에서만 살아있는 변수)
	//메소드 아규먼트
	public void classT(AnonyB anonyB) {
		anonyB.Print();
	}
	
	//main 또한 메서드

	public static void main(String[] args) {
		
		AnonyClassA anonyClassA = new AnonyClassA(); 
		
		AnonyB anonyB = new AnonyB();
		//객체 주입
		//anonyClassA.classT(new AnonyB() {
		//	@Override
		//};
		
		//AnonyB anonyB = new AnonyB();
		anonyB.Print();
		
		//지역변수 선언(메서드 안에서 사용했으니까)
		//여기서 다시 재 정의
		
		AnonyB anonyB2 = new AnonyB() {
			@Override
			public void display() {
				System.out.println("Hello");
				print2();
			}
			public void print2() {
				System.out.println("print2");
			}
		};
		
		// -> 이거는 혼자 개발할떄씀, 협력할떄는 안씀
		anonyB2.Print();
		anonyB2.display();
		

	}

}

class AnonyB {
	public void Print() {
		System.out.println("print");
	}
	
	public void display() {
		System.out.println("display");
	}
}


//다중 상속, 모든것은 추삭적인 메서드만 소유, 필드는 상수만 사용가능
interface AnonyA {
	public void print();
	
	public void display();
}