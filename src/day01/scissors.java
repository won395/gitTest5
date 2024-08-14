package day01;

import java.util.Scanner;

public class scissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		System.out.println("가로 :");
		num1 = sc.nextInt();

		int num2 = 0;
		System.out.println("세로 :");
		num2 = sc.nextInt();
		
		System.out.println(num1+(num1+1)*num2);
	}

}
