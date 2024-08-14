package daay02;

import java.util.Scanner;

public class While {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//반복문
		//반복문을 사용시, 조건값을 무한 루프 안되도록 할 것
		int num = 0; //초기값
		while(num < 10) //조건값
		{
			num += 5; //증감문, 증감값	
		}
		
		//출력, 1 - 9까지 츨력 / while 반복문 사용헐 것 / System.out.println() 한번만 사용할 것.
		
		int n1 = 1;
		while (n1 < 10) {
			if(n1%2 != 0 && n1%3 == 0) {
				System.out.println(n1++);
			}
			n1++;
		}
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("단수 입력: ");
		int i = s.nextInt();
		int j = 1;
		
		while (i <= 19) {
			while (j <= 9) {
				System.out.println(i+"X"+j+"="+(i*j));
				j++;
			}
		}
		
		
		
	}
}