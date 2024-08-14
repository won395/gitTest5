package day06;

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상속
		//부모가 자식에게 무언가를 주는 것
		//자바에서는 필드, 메소드를 자식에게도 사용할 수 있도록 만들어주는 것
		Animal animal = new Animal();
		animal.print();
		
		Cat cat = new Cat();
		//cat.toString(); //모든 크래스는 기본적으로 Object 클래스를 상속
		cat.print();
		
		Cat2 cat2 = new Cat2();
		cat.printCat(); //야옹2
		cat2.print(); 	//야옹
		
		//상속
		//사용하는 이유
		//공통된 코드를 최소화 시키기 위해서다
		//메모리를 덜 사용한다
		//반드시 사용하도록 정의
		
		//oop의 특징 중 하나 상속 ['다형성', '캡슐화']
		//java 모든 클래스는 오브젝트 클래스를 최상위 클래스로 상속
		//extends를 사용 안할 떄만 오브젝트가 디폴트로 상속된다
		
		//상속에 대한 방법
		//단일 상속
		//extends <= 이거 사용해서 상속을 받을 경우, 항상 상속되는 클래스 하나이다
		//익스텐드를 사용했을떄 여러개의 클래스를 상속할 없다
		//익스텐드는 클래스를 상속할떄 사용한다
		//익스텐드 오브젝트
		
		

	}

}

//부모 class
class Animal {  //Object 생략되어있음
	
	public void print() {
		System.out.println("야옹");
	}
}

//cat 클래스의 부모는 Animal이다
//자식 class
//Cat2 기준으로
class Cat extends Animal {
	public void printCat() {
		System.out.println("야옹2");
	}
}

//자식 클래스
class Cat2 extends Cat {
	
}