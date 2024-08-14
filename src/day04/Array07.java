package day04;

import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		int near = 0; //현재 배열의 index, 스택의 메모리 담당
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("기능을 입력해주세요. -1: 종료, 1: 입력, 2: 출력");
			num = scanner.nextInt();

			if (num == -1) {
				break;
			} else if (num == 1) {
					System.out.println("더 이상 입력 받을 수 없습니다.");
					arr[near] = scanner.nextInt();
					near+=1;
				} else if (num == 2) {
					//0: 1, 1: 2, => near는 값을 +1해야 됨
					near-=1;
					System.out.println(arr[near]);
				} else if(num == 3) {
					for(int i = 0; i < near; i++) {
						System.out.println(i+"번째 값: "+arr[i]);
					}
				}
		}

	}

}
