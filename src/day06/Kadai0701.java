package day06;

import java.util.Scanner;

public class Kadai0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		Managerment manager = new Managerment();
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		while(true){
			//1. 1번.stack , 2번 queue
			//2. 1.입력할 숫자, 2.출력할 숫자 3.현재까지 입력된 모든 숫자
			System.out.println("1번.stack , 2번 queue");
			int n1 = scan.nextInt();
			if(n1 == 1) {
				System.out.println("1.입력, 2.출력 3.모두출력");
				int n2 = scan.nextInt();
				if(n2 == 1) {
					stack.push();
				}else if(n2 == 2) {
					stack.pop();
				}else if(n2 == 3) {
					stack.print();
				}else {
					System.out.println("다시 입력");
				}
			}else if(n1==2){
				System.out.println("1.입력, 2.출력 3.모두출력");
				int n2 = scan.nextInt();
				if(n2 == 1) {
					queue.push();
				}else if(n2 == 2) {
					queue.pop();
				}else if(n2 == 3) {
					queue.print();
				}else {
					System.out.println("다시 입력");
				}
			}else {
				System.out.println("다시 입력");
			}
			
			
		}

	}

}

class Managerment {
	int[] arr = new int[5];
	int near;
	int front;
	Scanner sc = new Scanner(System.in);
	
	public void push() {
		if(arr[0] != 0) {
			for(int i = 0; i<arr.length;i++) {
				if(arr[i] == 0) {
					System.out.println((i+1) + "번째 : ");
					near = sc.nextInt();
					arr[i] = near;
				}
			}
		}
		else if(arr[0] == 0){
			for(int i = 0; i<arr.length;i++) {
				System.out.println((i+1) + "번째 : ");
				near = sc.nextInt();
				arr[i] = near;			
				}
		}
	}
	public void pop() {
		
	}
	
	public void print() {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class Stack extends Managerment{
	@Override
	public void pop() {	
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);	
				break;
			}
		}
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] != 0) {
				arr[i] = 0;
				break;
			}	
		}
	}
}
class Queue extends Managerment{ 
	@Override
	public void pop() {	
		System.out.println(arr[0]);	
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			if(arr[4] == arr[3]) {
				arr[arr.length-1] = 0;
			}
		}	
	}
}
