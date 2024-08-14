package day04;

import java.util.Scanner;

public class Array008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String [] names = new String[10];
		
		while(true) {
			System.out.println("몇 번째 인덱스에 값을 넣겠습니까?");
			int index = s.nextInt();
			
			if(index <0) {
				for(int i= 0;i<names.length; i++) {
					System.out.println(i+"번째 : "+names[i]);
				}
				continue;
			}
			
			System.out.println("삽입할 이름을 입력해 주세요");
			names[index] = s.next();
		}
		

	}

}
