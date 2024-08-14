package day02;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("받은 돈: ");
			int money = sc.nextInt();
		
			if(money >= 50000) {
				System.out.println("5만원 이상");
			}else if(money >= 10000) {
				System.out.println("만원 이상");
			}else if(money >= 5000) {
				System.out.println("5천원 이상");
			}else if(money >= 1000) {
			System.out.println("천원 이상");
			}else {
				System.out.println("천원도 없음");
			}
		}
	}

}
