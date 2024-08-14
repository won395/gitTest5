package day03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//while문 작성
		int num = 0; //초기값
		while(num < 10) { //조건값
			System.out.println(num);
			num++; //증감값
		}
		
		//for (초기값; 조건값; 증감값)
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
		*/
		for(int j = 2; j< 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j+"X"+i+"="+(j*i));
			}
		}

	}

}
