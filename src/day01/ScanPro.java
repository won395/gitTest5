package day01;

import java.util.Scanner;

public class ScanPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println((float)num1/num2);
		

	}

}
