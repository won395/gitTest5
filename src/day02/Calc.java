package day02;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//수 두개 입력 받기
		//기호를 입력 받기 +, *, /, -, %
		//총 3개 입력 받는다
		
		//첫 번째 입력 받은 값이 두 번째보다 작을때
		// 첫번째 입력받은 값과 두번째 입력 받은 값을 변경하기
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("기호 입력 : ");
			String a = sc.next();
			System.out.println("첫 번째 입력: ");
			int n1 = sc.nextInt();
			System.out.println("두 번째 입력: ");
			int n2 = sc.nextInt();
			
			if(n2>n1) {
				n1 = n1^n2;
				n2 = n2^n1;
				n1 = n1^n2;
			}
			/**
			if(a.equals("+")) {
				System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
			}else if(a.equals("-")) {
				System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
			}else if(a.equals("*")) {
				System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
			}else if(a.equals("/")) {
				System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
			}else{
				System.out.println(n1 + "%" + n2 + "=" + (n1%n2));
			}
			*/
			switch(a) {
			case "+":
				System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
				break;
			case "-":
				System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
				break;
			case "*":
				System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
				break;
			case "/":
				System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
				break;
			case "%":
				System.out.println(n1 + "%" + n2 + "=" + (n1%n2));
				break;
			}
			if(n1==0) {
				if(n2 == 0) {
					break;
				}
			}
		}
		

	}

}
