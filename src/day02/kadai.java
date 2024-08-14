package day02;

import java.util.Scanner;

public class kadai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("첫 번째 입력: ");
		num1 = sc.nextInt();
		System.out.println("두 번째 입력: ");
		num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println(num1 +"/"+ num2 + "="+ num1/num2);
		}else {
			System.out.println(num2 +"/"+ num1 + "="+ num2/num1);
		}
		
		
		
		
	}

}
