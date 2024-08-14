package day07;

import java.util.Scanner;

public class Sturucture {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택 해주세요. 1번, stack 2번 queue.");
		int selectArr = scanner.nextInt();
		
		Managerment managerment = new Stack();
		
		//1. 1번, stack 2번 queue.
		//1번 눌렀을 때, Stack
		//2번 눌렀을 때, Queue
		if(selectArr == 1) {
			managerment = new Stack();
		} else {
			managerment = new Queue();
		}
		
		
		while(true) {
			
			//2. 1.입력할 숫자, 2. 출력 할 숫자. 3. 현재까지 입력된 모든 숫자.
			int num = scanner.nextInt();
			if(num == 1) {
				
				System.out.println("저장 할 숫자를 입력해 주세요.");
				num = scanner.nextInt();
				//입력 기능
				managerment.push(num);
			} else if(num == 2){
				num = managerment.pop();
				System.out.println(num);
			}
			
			else if(num == 3) {
				managerment.print();
			}
		}
	}

}


//배열을 어디다가 저장하는게 효율이 좋은가.
abstract class Managerment {
	int arr[] = new int[5];
	protected int near; //여기에 private하는게 맞기는 한데, 그러면 복잡해져서 힘들 수 있으니깐.
	protected int front;
	
	public void push(int num) {
		arr[near] = num;
		near++;
	}

	
	public int pop() { 
		return 0; 
		} //매개변수 추가하시거나 그건 자유롭게.
	
	public void print() {
		
		for(int i=0; i < near; i++) {
			System.out.println("i행: "+arr[i]);
		}
		
	}	
}

class Stack extends Managerment{
	
	//stack은 front가 필요 없어요.
	//나가는곳이 들어오는 곳이랑 같기 때문이다.
	//queue랑 stack이랑 pop은 다를 수밖에 없고요.
	
	//부모가 정의해준 것에 변형 해야한다.
	@Override
	public int pop() {
		
		//-1한 상태로 num변수에 값을 옮기고.
		int num = arr[--near];
		//기존의 배열에는 초기화.
		arr[near] = 0;
		
		return num;
	}
	
}
class Queue extends Managerment{
	
	@Override
	public int pop() {
		
		int num = arr[front];
		arr[front++] = 0;
		
		shift();
		
		return num;
	}
	
	//앞에 front 빈 수 만큼, 앞으로 숫자 미는 역할
	//method로 나눔으로써, 언제든 이 기능을 선택해서 사용할 수 있다.
	//OOP
	public void shift() {
		int count = front;
		//크기가 5인 배열인데, 3까지 저장 됐을 수도 있다.
		for(int i=0; i < near-1; i++) {
			arr[i] = arr[i+count];
		}
	}
	
}

//값 5개 까지 저장 가능.
//5개 모두 입력 되면, 당연히 값 저장 x
//값이 5개 저장 안 될 때는 항상 입력. [ 유효성 검사 ]
//상속 사용해서 만드시면 됩니다.
//method는 2개만 사용 가능.
//Stack
//FILO, LIFO
//push - 값 넣기
//pop - 값 출력


//Queue
//FIFO
//push - 값 넣기
//pop - 값 출력

//@Override 까지 사용.