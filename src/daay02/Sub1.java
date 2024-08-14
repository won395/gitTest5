package daay02;

import java.util.Scanner;

public class Sub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sa = new Scanner(System.in);
		System.out.println("첫 번째 수: ");
		int n1 = sa.nextInt();
		System.out.println("두 번째 수: ");
		int n2 = sa.nextInt();
		
		if (n1 > n2) {
			System.out.println("잘못된 예시: "+ n1+ "/"+ n2 +"="+(n2/n1));
			System.out.println("잘못 예시: "+ n1+ "/"+ n2 +"="+(n1/n2));
		} else {
			System.out.println("잘못된 예시: "+ n2+ "/"+ n1 +"="+(n1/n2));
			System.out.println("잘못 예시: "+ n2+ "/"+ n1 +"="+(n2/n1));		
			}
		*/
		
		//숫자 입력 받는다. 0  이상 10000 미만.
		//입력받은 숫자가 홀수인지 짝수인지 구분짓도록하고, 
		//결과가 짝수면 "짝수" , 홀수면 "홀수로 출력 0은 0입니다. 음수는 음수
		/*		
		Scanner al = new Scanner(System.in);
		System.out.println("0에서 10000미만의 숫자를 입력하시오");
		int n1 = al.nextInt();
				
		if(n1 % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
			}
			else if(n1 < 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		*/
		
		//3
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("받은 돈: ");
		int mon = s.nextInt();
		
		if (mon >= 50000) {
			System.out.println("5만원 이상");
		} else if (mon >= 10000 ) {
			System.out.println("???");
		} else if (mon >= 5000 ) {
			System.out.println("??");
		} else {
			System.out.println("?");
		}
		*/
		
		//수 2개 입력
		//기호 입력 +, *, /,-,%
		//총 3번 입력
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("1번째: ");
		int n1 = s.nextInt();
		System.out.println("2번째: ");
		int n2 = s.nextInt();
		System.out.println("기호를 입력하시오(+, *, /, -, %): ");
		String n3 = s.next();
		
		/* 추가로 씀
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
		
		
		//4
		int num = 100;
		String str = "";
		if (num < 100) {
			str = "abc";
		} else {
			str = "def";
		}
		System.out.println(str);
		
		//5
		String str = "abc";
		int num = 2;
		switch (str) {
		case "1":
			num = 1;
			//break; //무조건 있어야됨
		case "2":
			num = 2;
			break;
		}
		System.out.println("num: "+num);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		int grade = score/10;
		String print;
		switch(grade) {
		case 10: case 9: //합쳐서 쓸수있다
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
		System.out.println("등급은?"+print);
		
		
		//6 대문자 소문자 구별하는 법
		Scanner sc = new Scanner(System.in);
		System.out.println("한글자 입력: ");
		String str = sc.next();
		float word = str.charAt(0);
		int check = 0;
		if(word < 'a') {
			check = 0;
		} else {
			check = 1;
		}
		System.out.println('a' == 97);
		System.out.println('A' == 65);
		//대, 소문자 구분
		switch (check) {
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("a");
			break;
		}
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("1번째: ");
		int n1 = s.nextInt();
		System.out.println("2번째: ");
		int n2 = s.nextInt();
		System.out.println("기호를 입력하시오(+, *, /, -, %): ");
		String n3 = s.next();
		
		 if(n1 < n2) {
		 	n1=n1^n2;
		 	n2=n1^n2;
		 	n1=n1^n2;
		 }
		 
		 switch (n3) {
		 case "+":
			 System.out.println(n1+"+"+n2+"="+(n1+n2));
			 break;
		 case "-":
			 System.out.println(n1+"-"+n2+"="+(n1-n2));
			 break;
		 case "*":
			 System.out.println(n1+"*"+n2+"="+(n1*n2));
			 break;
		 case "/":
			 System.out.println(n1+"/"+n2+"="+(n1/n2));
			 break;
		 case "%":
			 System.out.println(n1+"%"+n2+"="+(n1%n2));
			 break;
		 default:
			 System.out.println("오류! 다시 시도 하시오.");
		 }

	}

}
