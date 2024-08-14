package day07;

import java.util.Scanner;

public class Structure {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택 해주세요. 1번, stack 2번 queue.");
		int selectArr = scanner.nextInt();

		//동적 바인딩
		//부모가 정의한 method만 호출이 가능합니다.
		//부모를 상속받은 자식클래스가 method를 만들어도 호출 할 수 없다.
		
		//왜 생겼는가?
		//코드가 너무 다양해요. ( 사람마다 코드스타일, 규칙 모두 다르다.)
		//틀렸다. 맞다 x
		
		//코드를 보는 입장에서 너무 힘들다.
		//규칙 정했기 때문에, 이 기능을 사용할때는 method명이 다 같다.
		//코드 가독성 up, 유지보수 용이 up.
		
		//상속의 큰 이유는 부모 class를 메모리 할당 대상으로 삼으면서.
		//자식클레스가 멋대로 코드 확장을 억제.
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

	
	public abstract int pop(); //매개변수 추가하시거나 그건 자유롭게.
	//대신에 @Override가 되도록.
	//3. 전체 출력(전체 출력 필요한 경우)
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
