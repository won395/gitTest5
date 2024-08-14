package day03;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("단수 입력: ");
		int i = s.nextInt();
		int j = 1;
		
		while (i <= 9) {
			while (j <= 9) {
				System.out.println(i+"X"+j+"="+(i*j));
				j++;
			}
		}
		
		// 다른 예
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i+"X"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
