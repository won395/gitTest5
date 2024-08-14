package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StuFuntion sf = new StuFuntion();
		while(true) {
			System.out.println("기능 선택 (1.입력 2.출력 3.수정 4.삭제) : ");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					sf.insert();
					break;
				case 2:
					sf.select();
					break;
				case 3:
					sf.update();
					break;
				case 4:
					sf.delete();
					break;
				default:
					System.out.println("다시 입력하세요");
				
			}
		}
	}

}
