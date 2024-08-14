package day04;

import java.util.Scanner;

public class Array06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[5];
		//FIFO 선입선출 = QUEUE.
		//QUEUE 처음 들어온것이 처음으로 나가기떄문에 메모리 관리가 사시상 불푠하다
		//스택 FIFO 마지막에 들어온 값을 처음으로 빼기도 합니다. 메모리 관리 수월
		int front = 0;
		int near = 0;
		int [] data = new int[5];
		
		//QUEUE 0, 1, 2, 3, 4; 맨 앞부분 인덱스를 담담: front <= 값 출력
		//QUEUE 0, 1, 2, 3, 4; 맨 뒷부분 인덱스를 담담: near <= 값 넣을떄
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			//-1은 while 종료
			//1은 쿼리에 값을 넣는다 push(); //입력
			//2는 쿼리에 값을 뺸디 pop(); 	//출력
			System.out.println("사용 할 기능을 입력해주세요 -1:종료, 1:입력, 2:출력");
			num = sc.nextInt();
			//사용자가 -1을 입력힐때까지
			if(num == -1) {
				break;
			} else if(num == 1) { //1을 입력 받는다
				if (near >= data.length) {
					System.out.println("입력히고 싶은 값을 입력해주세요.");
					data[near] = sc.nextInt();
					near+=1;
				}
			} else if(num == 2) {
				if(near <= 0) {
					System.out.println("더이상 값을 넣을 수 없습니다. ");
					continue;
				}
				System.out.println("출력 값: "+data[0]);
				for (int i = 1; i < data.length; i++) {
					data[i - 1] = data[i];
				}
				near--;
			}
			
		}
	}

}
