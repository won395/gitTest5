package day03;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while의 실행조건 조건이 참일때 실행
		//do while 또한 조건이 참일때 실행
		//단, 애는 무조건 1번 실행
		
		Scanner s = new Scanner(System.in);
		//do while 사용
		int num = 0;
		do {
			System.out.println("실행확인하기");
			num = s.nextInt();
			System.out.println("입력받은 숫자: ");
		}while(num != 0);
		
		//while 사용
		num = 0;
		while(num != 0) {
			System.out.println("실행확인하기");
			num = s.nextInt();
			System.out.println("입력받은 숫자: ");
		}

	}

}
