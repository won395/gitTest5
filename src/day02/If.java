package day02;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("실행이 될까요?");
		}
		
		int num = 100;
		if(true) {
			num+=100;
		}
		if(false) {
			num+=500;
		}
		System.out.println(num);
		
		//조금 난이도 높이기
		boolean check = 100 > 50;
		if(100 > 50) {
			System.out.println("동작 할까요?");
		}
		
		boolean check2 = 100 > 100;
		if(check2) {
			System.out.println("실행 될까요?");
		}
		
		// if - else
		if(true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(!(100>100)) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
		//숫자 입력 받는다 0 이상 10000 미만.
		// 입력 받은 숫자가 홀수인지 짝수인지 구분짓도록 하고
		//0은 짝수가 출력됩니다.
		while(true) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 :");
			int num1 = 0;
			num1 = sc.nextInt();
			
			if(num1 % 2 == 0) {
				System.out.println("짝수");
			}else{
				System.out.println("홀수");
			}
		}
	}

}
