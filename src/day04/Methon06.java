package day04;

public class Methon06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = Methon06.add(5, 4); //10, 5
		
//		System.out.println(Methon06.add);
		System.out.println(result);
		
		Methon06.print("ab");
		
		
		

	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static void print(String print) {
		System.out.println("반갑습니다. "+print);
	}
	
	//오버로딩
	//매개변수 갯수가 다르기떄문에 조건성립
	public void print() {
		System.out.println("Hello World");
	}

}
