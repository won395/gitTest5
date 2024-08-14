package day04;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		int [] arr = new int[5];
		Arr a = new Arr();
		
		
		while(true) {
			System.out.println("기능을 입력해주세요. -1: 종료, 1: 입력, 2: 출력(FIFO), 3:출력(FILO)");
			int num = scanner.nextInt();
			
			if(num == -1) {
				break;
			}
			else if(num == 1) {
				a.in();
			}
			else if(num == 2) {
				a.outFF();
			}else if(num == 3) {
				a.outFL();
			}
		}
		
	}

}
class Arr{
	Scanner  scanner = new Scanner(System.in);
	int [] data = new int[5];
	int front = 0;
	int front1 = data.length-1;
	int near = 0;
	public void in() {
		System.out.println("입력 받을 수를 입력해주세요.");
		data[near] = scanner.nextInt();
		near++;
	}
	public void outFF() {
		System.out.println("출력값: "+data[front]);
		front++;
	}
	public void outFL(){
		
		System.out.println("출력값: "+data[front1]);
		front1--;
	}
}