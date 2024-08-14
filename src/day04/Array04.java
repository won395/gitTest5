package day04;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int 5개 받는다
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		while(true) {
			System.out.println("숫자 5개를 입력하시려면 아무 숫자를 입력하시고, 더 이상 입력을 원하지 않다면 -1을 입격하세요.");
			int a = sc.nextInt();
			if(a == -1) {
				break;
			} else if (a == 2) {
				System.out.println("출력된 숫자: ");
			} else {
				System.out.println("오류입니다.");
			}
			
			String [] b = new String[5];
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println("숫자를 입력해주세요.");
				b[i] = sc.next();
			}
			for(int i = 0; i<b.length; i++) {
				System.out.print(b[i]);
			}
			System.out.println();
		}
		
	}
}
