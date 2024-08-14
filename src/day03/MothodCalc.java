package day03;

import java.util.Scanner;

public class MothodCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5시 할 과제 
		// 메소드
		//사칙연산, 0하고 0이 입력 받을때까지 계속해서 진행되는 계산기,
		//if, switch 메소드 호출.
		//메소드 호풀 <= 애만 하면 된다
		//출력을 메소드에서 하셔도 되고 메소드에서 return 받으셔도 되고. 자유
		
		Calc c =new Calc();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫 번째 입력: ");
			int n1 = sc.nextInt();
			System.out.println("두 번째 입력: ");
			int n2 = sc.nextInt();
			System.out.println("기호 입력 : ");
			String a = sc.next();
			
			int sum = c.setSum(n1, n2);
			int sub = c.setSub(n1, n2);
			int mul = c.setMul(n1, n2);
			int div = c.setDiv(n1, n2);
			int mod = c.setMod(n1, n2);
			
			if(n2>n1) {
				n1 = n1^n2;
				n2 = n2^n1;
				n1 = n1^n2;
			}
			if(a.equals("+")) {
				System.out.println(n1 + "+" + n2 + "=" + (c.getSum()));
			}else if(a.equals("-")) {
				System.out.println(n1 + "-" + n2 + "=" + (c.getSub()));
			}else if(a.equals("*")) {
				System.out.println(n1 + "*" + n2 + "=" + (c.getMul()));
			}else if(a.equals("/")) {
				System.out.println(n1 + "/" + n2 + "=" + (c.getDiv()));
			}else{
				System.out.println(n1 + "%" + n2 + "=" + (c.getMod()));
			}
			if(n1==0) {
				if(n2 == 0) {
					break;
				}
			}

		}
	}

}

class Calc{
	private int sum;
	private int sub;
	private int div;
	private int mul;
	private int mod;
	
	public int getSum() {
		return sum;
	}
	public int setSum(int num1, int num2) {
		return this.sum = num1+num2;
	}
	public int getSub() {
		return sub;
	}
	public int setSub(int num1, int num2) {
		return this.sub = num1-num2;
	}
	public int getDiv() {
		return div;
	}
	public int setDiv(int num1, int num2) {
		return this.div = num1/num2;
	}
	public int getMul() {
		return mul;
	}
	public int setMul(int num1, int num2) {
		return this.mul = num1*num2;
	}
	public int getMod() {
		return mod;
	}
	public int setMod(int num1, int num2) {
		return this.mod = num1%num2;
	}
	
}
