package daay02;

import java.util.Scanner;

public class Sub2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >=80) {
			System.out.println("B");
		} else if (score >=70) {
			System.out.println("c");
		} else {
			System.out.println("D");
		}
		*/
		
		//2
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("1번째: ");
			int n1 = s.nextInt();
			System.out.println("2번째: ");
			int n2 = s.nextInt();
			
			if (n1 == 0 && n2 == 0) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("기호를 입력하시오(+, *, /, -, %): ");
			String n3 = s.next();
			
			 if(n1 < n2) {
			 	n1=n1^n2;
			 	n2=n1^n2;
			 	n1=n1^n2;
			 }
			 
			if (n3.equals("+")) {
				System.out.println(n1+"+"+n2+"="+(n1+n2));
			} else if (n3.equals("-")) {
				System.out.println(n1+"-"+n2+"="+(n1-n2));
			} else if (n3.equals("*")) {
				System.out.println(n1+"*"+n2+"="+(n1*n2));
			} else if (n3.equals("/")) {
				System.out.println(n1+"/"+n2+"="+(n1/n2));
			} else if (n3.equals("%")) {
				System.out.println(n1+"%"+n2+"="+(n1%n2));
			} else {
				System.out.println("오류");
			}
		}
	}

}
