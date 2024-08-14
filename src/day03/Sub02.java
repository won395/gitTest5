package day03;

import java.util.Scanner;

public class Sub02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*메소드
		 * 사칙연산, 0하고 0이 입력받을때까지 계속해서 진행되는 계산기
		 * if, switch 메소드 호출
		 * 메소드 호출 <= 애만하면 됨
		 * 출력을 메소드에서 하셔도 되고, 메소드에서 return 하셔도 되고 자유
		 * 메소드 사용 주목적은 어떻게든  코드를 짧게만드는것
		 */
		
		Sc sc = new Sc();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("첫번쨰 숫자: ");
			int n1 = s.nextInt();
			System.out.println("두번쨰 숫자: ");
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
					System.out.println(n1+"+"+n2+"="+(sc.getAdd(n1, n2)));
				} else if (n3.equals("-")) {
					System.out.println(n1+"-"+n2+"="+(sc.getSub(n1, n2)));
				} else if (n3.equals("*")) {
					System.out.println(n1+"*"+n2+"="+(sc.getRhq(n1, n2)));
				} else if (n3.equals("/")) {
					System.out.println(n1+"/"+n2+"="+(sc.getSksna(n1, n2)));
				} else if (n3.equals("%")) {
					System.out.println(n1+"%"+n2+"="+(sc.getskajwl(n1, n2)));
				} else {
					System.out.println("오류");
				}
		}
	}

}

class Sc {
	int add;
	int sub;
	int rhq;
	float sksna;
	float skajwl;
	
	
	public int getAdd(int a, int b) {
		return a+b;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getSub(int a, int b) {
		return a-b;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	public int getRhq(int a, int b) {
		return a*b;
	}
	public void setRhq(int rhq) {
		this.rhq = rhq;
	}
	public float getSksna(int a, int b) {
		return a/b;
	}
	public void setSksna(float sksna) {
		this.sksna = sksna;
	}
	public float getskajwl(int a, int b) {
		return a%b;
	}
	public void setskajwl(float skajwl) {
		this.skajwl = skajwl;
	}
	
}
