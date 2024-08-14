package study;

public class Hellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow Word");
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('a');
		
		System.out.println("3+4"+7);
		System.out.println(3+4+"7");
		
		//정수
		//byte, short, int, Long
		byte by = 10;
		short sh = 5000;
		int in = 214748;
		Long lo = 222L; 	//숫자 뒤에 대문자 L이나 소문자 l을 무조건 쓴다
		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);
		
		in = 100;
		System.out.println(in);
		
		int num1 = 100;
		int num2 = 55;
		System.out.println(num1+num2);
		
		//실수
		//float, double
		float fl = 3.14F; 	//애도 뒤에 대문자가 붙는다
		double dou =3.14F;
		System.out.println(fl);
		System.out.println(dou);
		
		System.out.println(5/2);
		System.out.println(5/2F);
		
		//문자
		//char(문자하나 'a') 			+ 번외 String (문자열, 문자)
		char ch = 97;
		System.out.println(ch);
		
		//논리 타입
		//boolean
		boolean bl = true;
		boolean bl2 = 5>10;
		
	 
		String str ="apple";
		System.out.println(str);
	
		str ="car";
		System.out.println(str);
		
		str ="banana";
		System.out.println(str);
		

	}

}
