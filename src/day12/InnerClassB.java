package day12;

import java.util.Scanner;

public class InnerClassB {

	public static void main(String[] args) {
		
		//숫자 2개 문자 1개(기호: )
		//사칙연산만들어라
		
		//무한반복 while(true)
		//잘못 입력했을떄 에러가 발생됨 try catch로 에러가 발생이 되어도 계속진행 할수 있도록 예외 처리해주세요
		//Exception 사용 가능
		while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                // Prompt user for inputs
                System.out.println("1번째 값:");
                int num1 = sc.nextInt();
                System.out.println("2번째 값:");
                int num2 = sc.nextInt();
                System.out.println("+, -, *, / 중에 선택하세요:");
                String op = sc.next();
                
                // Instance of the inner class
                NumCal numC = new InnerClassB().new NumCal();
                
                // Switch case for operations
                switch (op) {
                    case "+":
                        numC.add(num1, num2);
                        break;
                    case "-":
                        numC.sub(num1, num2);
                        break;
                    case "*":
                        numC.mul(num1, num2);
                        break;
                    case "/":
                        numC.div(num1, num2);
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
		}
	}
	
	static class NumCal {
		
		//static x <= innerClass는 static 사용할 수없다
		//정적 멤버 클래스
		public static void add(int num1, int num2) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
			
		public void sub(int num1, int num2) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		
		public void mul(int num1, int num2) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		
		public void div(int num1, int num2) {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}

	}
}