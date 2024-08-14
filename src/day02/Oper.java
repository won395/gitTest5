package day02;

public class Oper {

	public static void main(String[] args) {
		/*
		// 대입 연산자
		int num = 100;
		num+=50;
		
		System.out.println(num);
		//num = num+50; => num+=50;
		num-=100;
		System.out.println(num);
		
		num/=5;
		System.out.println(num); //num = num / 5; = 50 / 5 = 10
		
		num %= 4; System.out.println(num); //2
		*/
		//증감연산자
		 int num1 = 100;
		num1 += 1;
		System.out.println(num1);
		
		num1++;
		++num1;
		
		num1 = 100;
		
		System.out.println(num1++);
		System.out.println(++num1);
		
		int cal1 = 100;
		int cal2 = 500;
		System.out.println(cal1++ + ++cal2); //100 + 501
		
		//비교연산자
		// > , < , >= , <= , == , (!=, !)
		System.out.println(!"문자".equals("문자"));
		System.out.println(100 == 50); //false
		System.out.println(100 != 50); //true;
		
		//비트연산자
		//AND, OR, NOT, X
		//AND &
		System.out.println(7&4);
		//OR | 
		//XOR ^
		//NOT ~
		
		//XOR ^
		int num3 = 100;
		int num4 = 500;
		
		int temp = num3;
		num3 = num4;
		num4 = num3;
		
		num3 = num3^num4;
		num4 = num3^num4;
		num3 = num3^num4;
		
		//NOT ~
		System.out.println(~num3);
		
		//논리 연산자
		// && , ||
		System.out.println(100 == 100 && 50 > 100);
		// true, 모두의 조건이 true일 때
		System.out.println(100 == 100 || 50 > 100);
		// or , 한개라도 true가 나왔을때
		
		System.out.println(100 == 100 && 50 > 100 || 50 < 60);
		
		// 시프트 연산자
		// <<  >>
		System.out.println(4<<2);
		System.out.println(4 << 33);
		
		//삼합 연산자
		// ? :
		// ( 조건 ) ? (조건이 참 일때) : ( 조건이 거짓일 때)
		String result = (100 < 50) ? "T" : "F";
		System.out.println(result);
		
		
		
	}

}
