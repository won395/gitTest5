package day02;
import java.util.Scanner;

public class Zo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while(num < 10) {
			if(num%2 !=0) {
				if(num%3 == 0) {
					System.out.println(num);
				}
			}
				
			num++;
		}
		//구구단 만들기
		//1 ~ 19
		//1. 입력 받은 숫자의 단이 나오도록 할것
		//2. 입력 받을때, 1 ~ 19 값이 아니면 다시 받도록
		// 4시까지 시간
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 19 입력 : ");
		int n1 = sc.nextInt();
		while(n1>20) {
			System.out.println("19 이하로 다시 입력");
			n1 = sc.nextInt();
			
		}
		while(i<10) {
			System.out.println(n1+"*"+i+"="+n1*i);
			i++;
		}

	}

}
