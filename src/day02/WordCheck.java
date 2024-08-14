package day02;

import java.util.Scanner;

public class WordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자 입력");
		String str = sc.next();
		
		float word = str.charAt(0);
		
		//대문자 소문자 구분
		//변수 추가 사용 가능
		
		int check = 0;
		if(word < 97) {
			check = 0;
		}else {
			check = 1;
		}
		System.out.println('a' == 97);
		System.out.println('A' == 65);
	}

}
