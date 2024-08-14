package test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Managerment manager = new Managerment();

        while (true) {
            System.out.println("선택하시오: 1. Stack 2. Queue");
            int ch = sc.nextInt();

            if (ch == 1) {
                manager = new Stack();
            } else if (ch == 2) {
                manager = new Queue();
            } else {
                System.out.println("번호를 잘못 선택하셨습니다 다시 선택해주세요");
                continue;
            }

            while (true) {
                System.out.println("1: 입력할 숫자, 2: 출력할 숫자, 3: 입력된 모든 숫자, 4: 나감");
                int ac = sc.nextInt();

                if (ac == 1) {
                    System.out.print("입력할 숫자: ");
                    int number = sc.nextInt();
                    manager.push(number);
                } else if (ac == 2) {
                    int poppedNumber = manager.pop();
                    if (poppedNumber != Integer.MIN_VALUE) {
                        System.out.println("출력할 문자: " + poppedNumber);
                    }
                } else if (ac == 3) {
                    manager.displayAll();
                } else if (ac == 4) {
                    break;
                } else {
                    System.out.println("번호를 잘못 선택하셨습니다 다시 선택해주세요");
                }
            }
        }
    }
}

class Managerment {
    int[] array = new int[5];
    int size = 0;

    public void push(int number) {
        if (size < array.length) {
            array[size] = number;
            size++;
        } else {
            System.out.println("stack이 가득찼습니다.");
        }
    }

    public int pop() {
        if (size > 0) {
            size--;
            return array[size];
        } else {
            System.out.println("stack이 비었습니다.");
            return Integer.MIN_VALUE;
        }
    }

    public void displayAll() {
        System.out.print("현재 리스트에 있는 번호: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Stack extends Managerment {
    @Override
    public void push(int number) {
        super.push(number);
    }

    @Override
    public int pop() {
        return super.pop();
    }
}

class Queue extends Managerment {
    protected int front = 0;
    protected int rear = 0;

    @Override
    public void push(int number) {
        if (size < array.length) {
            array[rear] = number;
            rear = (rear + 1) % array.length;
            size++;
        } else {
            System.out.println("Queue 가득찼습니다");
        }
    }

    @Override
    public int pop() {
        if (size > 0) {
            int number = array[front];
            front = (front + 1) % array.length;
            size--;
            return number;
        } else {
            System.out.println("Queue 비어있습니다");
            return Integer.MIN_VALUE;
        }
    }
}
