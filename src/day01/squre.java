package day01;

import java.util.Scanner;

public class squre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		System.out.println("몇번 접을까요? :");
		num1 = sc.nextInt();

		int sum = 1;
		for(int i = 1; i<num1; i++) {
			sum = sum*2;
		}
		System.out.println(sum);
		
	}

}
