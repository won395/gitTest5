package day04;

import java.util.Scanner;

public class Array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String [] names = new String[10];
		
		while(true) {
			System.out.println("몇 번째에 인덱스 값을 넣겠습니까?");
			int index = sc.nextInt();
			
			//음수를 입력했을 경우 지금까지 입력된 값을 모두 출력
			if(index < 0) {
				for(int i = 0; i < names.length; i++) {
					System.out.println(i+"번째 "+names[i]);
				}
				continue;
			}
			
			// 10개의 데이터 획보 0~9 //-1x -2x index 범위 벗어났기 때문에 나온다나
			System.out.println("삽입할 이름을 입력해주세요.");
			names[index] = sc.next();
		}

	}

}
