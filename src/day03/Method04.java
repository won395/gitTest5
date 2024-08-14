package day03;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 method04 = new Method04();
		method04.print();
		
		int result = method04.add(10, 5);
		System.out.println(result);
		
		String result2 = method04.add("Hello"," World");
		System.out.println(result2);
	}
	
	public void print() {
		System.out.println("Hello World");
	}
	
	//값 2개를 받겠다( 타입은 int와 int 받겠다.)
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public void add(int num1) {
		
	}
	
	//오버로딩 Qverroding
	//1. 매개변수 갯수가 다를 때
	//2.매개변수 선언된 타입이 다를 때.
	//선언할 때는 메소드 명은 보물 메소드가 하는 역할에 따라 정의
	//역할이 같은데, 굳이 add1, add2, add3 이렇게 만들 필요가 없으므로
	//그래서 오버로딩 사용한다
	
	//위의 조건 무시하고 리턴 타입만 다룰 때 오버로딩 안됨

	public String add(String str1, String str2) {
		return str1+str2;
	}
	
}
