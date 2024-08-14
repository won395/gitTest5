package day01;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력해 주세요 :");
		String str1 = sc.next();
		System.out.println("두 번째 숫자 입력해 주세요 :");
		String str2 = sc.next();
		
		// 두 개의 입력값을 사칙연산으로 표현하시오.
		// 나누기는 소수점이 표현되도록 하세요.
		
		System.out.println(str1);
		System.out.println(str2);
		
		int numStr1 = Integer.parseInt(str1);
		int numStr2 = Integer.parseInt(str2);
		
		System.out.println(numStr1+numStr2);
		System.out.println(numStr1-numStr2);
		System.out.println(numStr1*numStr2);
		System.out.println((numStr1/(float)numStr2));
		System.out.println(numStr1%numStr2);
		

	}

}
