package day02;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(false) {
			System.out.println("true");
		}else if(true){
			System.out.println("2번째 true");
		}else {
			System.out.println("false");
		}
		
		if(1000>5000) {
			System.out.println("1000이 5000보다 크다");
		}else if(1000> 300) {
			System.out.println("1000은 300보다 크다");
		}else {
			System.out.println("모두 틀리다");
		}
		
		//숫자 입력 받는다 0 이상 10000 미만.
		// 입력 받은 숫자가 홀수인지 짝수인지 구분짓도록 하고
		//결과가 짝수면 '짝수입니다',홀수면 '홀수입니다' 출력
		//0은 '입니다'가 출력됩니다.
		//음수는 '음수입니다'
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 :");
			int num1 = 0;
			num1 = sc.nextInt();
		
			if(num1 == 0) {
			System.out.println("0 입니다");
			}else if(num1 < 0){
				System.out.println("음수 입니다");
			}else if(num1 % 2 == 0) {
				System.out.println("짝수 입니다");
			}else {
				System.out.println("홀수 입니다");
			}
		}
	}

}
