package day02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1";
		int num = 2;
		switch(str) {
		case "1":
			num = 1;
			break;
		case"2":
			num = 2;
			break;
		}
		System.out.println("num: "+num);
		while(true) {
			Scanner sc = new Scanner(System.in);
			int score = sc.nextInt();
		
		//90점 이상 'A'
		//80점 이상 'B'
		//70점 이상 'C'
		//70점 미만 'D'
		/**
		int grade = score/10;
		String print;
		switch(grade) {
		case 10: case 9:
			print = "A";
			break;
		case 8:
			print = "B";
			break;
		case 7:
			print = "C";
			break;
		default:
			print = "D";
		}
		
		
		System.out.println("당신의 점수는"+score+"당신의 등급은"+print+"입니다");
		*/
		
			if(score >= 90) {
				System.out.println("듭급 A");
			}else if(score >= 80) {
				System.out.println("듭급 B");
			}else if(score >=70) {
				System.out.println("듭급 C");
			}else {
				System.out.println("듭급 D");
			}
		}
	}

}
