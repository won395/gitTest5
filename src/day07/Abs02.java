package day07;

public class Abs02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		Object b = new B();
		a.print();

	}

}
class A {
	public A () {
		System.out.println("A");
	}
	public void print() {
		System.out.println("C");
	}
}
class B extends A {
	public B() {
		//명시적으로 표현이 가능합니다 super(); => 사용하지 않으면 생략
		//생성자의 제일 위에 올라가 있어야한다
		//super 내가 상속하고 있는 클래스를 의미
		super(); //자기가 상속하고 있는 클래스
		//this(); 자기자신
		System.out.println("B");
	}
	public void display() {
		System.out.println("E");
	}
	@Override
	public void print() {
		System.out.println("D");
		super.print();
	}
}
