package day02;

import java.util.Scanner;

public class ProSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num%2) {
		case 1:
			System.out.println("홀수 입니다");
		case 0:
			System.out.println("짝수 입니다");
		}

	}

}
