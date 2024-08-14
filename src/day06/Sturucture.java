package day06;

import java.util.Scanner;															

public class Sturucture {															

public static void main(String[] args) {											
    	
        Scanner sc = new Scanner(System.in);										
        Managerment manager = new Managerment();
        //Managerment manager = new Stack(); 이 가능하다
        //동적 바인딩

        while (true) {																			//무한 루프
            System.out.println("선택하시오: 1. Stack 2. Queue 3.exit");							//
            int ch = sc.nextInt();																//

            if (ch == 1) {																		//
                manager = new Stack();															// Stack.pop으로 만들어도 되네 코드도 줄고 개꿀이네
            } else if (ch == 2) {																//
                manager = new Queue();															//
            } else if (ch == 3) {																//
            	break;																			//
            } else {																			//
                System.out.println("번호를 잘못 선택하셨습니다 다시 선택해주세요");						//
                continue;																		//
            }

            while (true) {																		//
                System.out.println("1: 입력할 숫자, 2: 출력할 숫자, 3: 입력된 모든 숫자, 4: 나감");		//
                int ac = sc.nextInt();															//

                if (ac == 1) { 																	//1 입력
                    System.out.print("입력할 숫자: ");												//
                    int number = sc.nextInt();													//
                    manager.push(number);														//
                } else if (ac == 2) { 															//2 출력
                    int poppedNumber = manager.pop();											//
                    if (poppedNumber != Integer.MIN_VALUE) { 									//최솟값 / 유효하지 않는 값 반환
                        System.out.println("출력한 문자: " + poppedNumber);						//
                    }
                } else if (ac == 3) { 															//전체 출력
                    manager.displayAll();														//
                } else if (ac == 4) { 															//히히탈출
                    break;																		//
                } else { 																		//번호 잘못 입력시
                    System.out.println("번호를 잘못 선택하셨습니다 다시 선택해주세요");					//
                }
            }
        }
    }
}

class Managerment {										//
    int[] array = new int[5];							//
    int size = 0;										//

    public void push(int number) {						//입력
        if (size < array.length) {						//
            array[size] = number;						//배열의 다음 위치에 저장됨
            size++;										//저장된 요소의 개수 증가
        } else {										//배열에 빈공간이 없는 경우
            System.out.println("stack이 가득찼습니다.");	//배열이 가득 찼음을 알림
        }
    }

    public int pop() {									//숫자를 제거하고 반환하는 메소드를 오버라이드 함
        if (size > 0) {									//배열에 저장된 요소가 있는 경우
            size--;										//저장된 값 감소
            return array[size];							//마지막 요소 반환
        } else {										//배열이 비어있는 경우
            System.out.println("stack이 비었습니다.");		//배열이 비었음을 알려줌
            return Integer.MIN_VALUE; 					//최솟값 / 유효하지 않는 값 반환
        }
    }

    public void displayAll() {							//현재 저장된 모든 숫자를 출력함
        System.out.print("현재 리스트에 있는 번호: ");		//출력 메세지
        for (int i = 0; i < size; i++) {				//저장된 모든 요소 순환?
            System.out.print(array[i] + " ");			//각 요소 출력
        }
        System.out.println();							//줄바꿈
    }
}

class Stack extends Managerment {						//Stack 클래스 선언, managerment를 상속
	
    @Override
    public void push(int number) {						//숫자를 추가하는 메소드를 오버라이드 함
        super.push(number);								//상위 클래스의 push 메서드를 호출
    }
    
    @Override
    public int pop() {									//숫자를 제거하고 반환하는 메소드를 오버라이드 함
        return super.pop();								//상위 클래스의 pop 메서드를 호출
    }
    
}

class Queue extends Managerment {						//Queue 클래스 선언, managerment를 상속
	
    protected int front = 0;							//큐의 앞쪽 인덱스를 저장할 변수 선언
    protected int rear = 0;								//큐의 뒷쪽 인덱스를 저장할 변수 선언

    @Override
    public void push(int number) {						//숫자를 추가하는 메소드를 오버라이드 함
        if (size < array.length) {						//배열에 빈공간이 있는 경우
            array[rear] = number;						//rear에 숫자 저장
            rear = (rear + 1) % array.length;			//rear 인덱스 순환
            size++;										//갯수 증가
        } else { 										//배열이 가득찬 경우
            System.out.println("Queue 가득찼습니다");		//큐가 꽉참
        }
    }

    @Override
    public int pop() {									//숫자를 제거하고 반환하는 메소드를 오버라이드 함
        if (size > 0) {									//배열에 저장된 숫자가 있는 경우
            int number = array[front];					//front에 숫자 저장
            front = (front + 1) % array.length;			//front 인덱스를 순환
            size--;										//저장된 숫자 감소
            return number;								//제거된 숫자 반환
        } else { 										//배열 비어있는 경우
            System.out.println("Queue 비어있습니다"); 		//큐가 비어있음
            return Integer.MIN_VALUE; 					//최솟값, 유효하지 않는값 반환
        }
    }
}

//값 5개까지 저장가능
//5게 모두 입력되면 당연히 값 저장 x
//값이 5개 저장 안될떄는 항상 입력 [유효성 검사]
//상속 사용해서 만들면 됨

//stack
//FIFO, LIFO [하노이탑]
//push - 값넣기
//pop - 값 출력

//Queue
//FIFO [은행, 웨이팅 음식점]
//push - 값넣기
//pop - 값 출력