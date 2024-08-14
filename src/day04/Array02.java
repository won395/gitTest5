package day04;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = new String[3];
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		
		//변수 선언 = 메모리 할당
		String str1 = new String();
		
		//배열 선언 배열을 의미하는 기호는 [] 대괄호이다
		//대괄호는 변수명 앞 혹은 뒤에 해도 된다
		//String [] names = : OK, String name 
		//name 이라는 변수가 선언되었으면서 String 타입의 메모리 공간이 3개 할당
		
		String [] name = new String[3];
		System.out.println(str);
		System.out.println(name[0]);
		
		System.out.println("이름을 적어주세요.");
		name[0] = "홍길동";
		name[1] = "슈퍼맨";
		name[2] = "베트맨";
		
		//반복문을 통해서 입력 받는다
		//반복문을 통해서 입력 받은값을 모두 출력하는것
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("이름을 적어주세요.");
			//for 에 선언된 인덱스(i)가 0, 1, 2 표현 가능
			name[i] = sc.next();
		}
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
