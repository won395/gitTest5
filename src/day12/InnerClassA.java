package day12;

//중첩 클래스
//class  안에서 사용할 것인지
//메서드 안에서 사용할 것인지

//접근제어자
//public, default, private(protected pass)
//public: 모든 프로젝트에서 접근 가능하다
//default: 같은 패키지에서만 접근이 가능하다
//private: 같은 클래스에서만 접근이 가능하다
public class InnerClassA {

	public static void main(String[] args) {
		Student stu = new InnerClassA().new Student();
		System.out.println(stu.num);
		stu.print();

	}
	
	//class 명칭하나당, 하나만 만들어주셈
	//여기서만 쓸건데 굳이
	private class Student {
		int num = 10;
		//접근제어자 리턴타입 메소드명() {}
		public void print() {
			System.out.println("Hello");
		}
	}
}
//객체지향언어의 특징은 클래스를 계속 나눕니다
//클래스 관리하기가 힘들어짐 많아질수로 관리할것들이 높아지고
//패키지가 관하기가 힘든 단계 조치방법 +> innderClass
//이클립스가 자동완성을 어느정도 억제