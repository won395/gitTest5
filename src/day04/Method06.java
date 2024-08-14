package day04;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method06 method06 = new Method06();
		
		
		int result = add(10, 5);//10,5
		System.out.println(result);
				//두개의 int값을 받고 이를 add method를 통해서
				//얻은 결과값을 저장
				//result를 출력
		Method06.print("Hello");
		
		method06.print();
		
		

	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static void print (String print) {
		System.out.println("반갑습니다"+print);
	}
	
	//오버로딩 갯수 다르기 때문에 조건 성립
	public void print() {
		System.out.println("Hello World");
	}

}
