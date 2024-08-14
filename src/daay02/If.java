package daay02;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("실행이 됨?");
		}
		
		int num = 100;
		if (true) {
			num+=100;
		}
		if (false) {
			num+=500;
		}
		System.out.println(num);
		
		//
		boolean check = 100 > 50;
		if (check) {
			System.out.println("동작?");
		}
		
		boolean check2 = 100 > 100;
		if(check2) {
			System.out.println("실행?"); //false 일뗴 실행 안됨
		}
		
		//if - else
		if(true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (100 > 100) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		//숫자 입력 받는다. 0이상 10000 미만.
		//입력받은 숫자가 홀수인지 짝수인지 구분짓도록하고, 
		//결과가 짝수면 "짝수" , 홀수면 "홀수로 0은 짝수가 출력이 된다.
		
		Scanner al = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int n1 = al.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
		

	}

}
