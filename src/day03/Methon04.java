package day03;

public class Methon04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methon04 method04 = new Methon04();
		method04.print();
		
		int result = method04.add(10, 5);
		System.out.println(result);
		
		String result2 = method04.add("Hello", "World");

	}
	
	public void print() {
		System.out.println("Hello Word");
	}
	//값 2개 받겠다 (타입은 int와 int 받겠다)
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public void add(int num1) {
		
	}
	
	//오버로딩
	//1. 매개변수 갯수가 다를때
	//2. 매개변수 선언된 타입이 다를때
	//선언할때는 메소드명은 보통 메소드가 하는 역할에 따라 정의
	//역할이 같은데, 굳이 add1, add2, add3 이렇게 만들 필요가 없다
	//그래서 오버로딩을 사용한다
	
	//위의 조건을 무시하고, 리턴타입만 다를때 오버로딩이 안됩니다.
	public String add(String str1, String str2) {
		return str1+str2;
	}

}
