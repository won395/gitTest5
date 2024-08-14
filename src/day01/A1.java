package day01;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		String str1 = sc.next();
		System.out.println("두번째 숫자를 입력하세요.");
		String str2 = sc.next();
		
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
		System.out.println(Integer.parseInt(str1)-Integer.parseInt(str2));
		System.out.println(Integer.parseInt(str1)*Integer.parseInt(str2));
		System.out.println((float)Integer.parseInt(str1)/Integer.parseInt(str2));
		
		//접었을때 나오는 사각형 구하기
		System.out.println("종이를 접을 횟수: ");
		int p1 = sc.nextInt();
		
		int nr = 1;
		
		for(int i = 0; i<p1; i++) {
			nr *= 2;
		}
		
		System.out.println("갯수는:"+nr);
		
		//가위질 횟수 구하기(겹쳐서 가르기 x)
		System.out.println("가로: ");
		int s1 = sc.nextInt();
		System.out.println("세로: ");
		int s2 = sc.nextInt();
		
		//(세로)+(세로+1)*(가로)
		System.out.println((s1*s2)+(s1+s2));
	}

}
