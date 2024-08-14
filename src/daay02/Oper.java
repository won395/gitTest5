package daay02;

public class Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//대입 연산자
		int num = 100;
		num +=50;
		System.out.println(num);
		num-=100;
		System.out.println(num);
		
		num/=5;
		System.out.println(num); // num = num / 5; = 50
		
		num%=4;
		System.out.println(num); //2
		
		//증감 연산자
		int num1 = 100;
		num1 += 1;
		System.out.println(num1);
		num++; //후위
		++num; //전위
		
		num1 = 100;
		System.out.println(num++);
		System.out.println(++num);
		
		int cal1 = 100;
		int cal2 = 500;
		System.out.println(cal1++ + ++cal2);
		
		//비교연산자
		// > , < , >= , <= , == , (!= , !)
		System.out.println("문자".equals("문자"));
		System.out.println(100 == 50); //false
		System.out.println(100 != 50); //true
		
		//비트 연산자
		//AND, OR, NOT, XOR
		
		//AND &
		System.out.println(7&4);
		
		//OR |
		
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
		System.out.println(100 == 100 && 50 > 100); // 모두 조건이 참일 때
		System.err.println(100 == 100 || 50 > 100); // 한 개라도 참일 떄
		
		System.out.println((100 == 100 && 50 > 100) || 50 < 60);
		
		//시프트 연산자
		// << , >>
		System.out.println(4<<2);
		System.out.println(4<<33);
		
		//삼합 연산자
		//? :
		// (조건) ? (조건이 참일 때) : (조건이 거짓일 때)
		String result = (100 < 50) ? "T" : "F";
		System.out.println(result);
		*/
		
		int num6 = 100;
		System.out.println(num6++);
		System.out.println(++num6);
		
		num6 += 1000;
		System.out.println(num6);
		System.out.println(num6/=2);
		
		System.out.println(2<<34);
		String result1 = (100 > 50 && 10 > 10) ? "T" : "F";
		System.out.println(result1);
		
		
		

	}

}
