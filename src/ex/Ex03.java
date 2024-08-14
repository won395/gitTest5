package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> korList = new ArrayList<Integer>();
        ArrayList<Integer> engList = new ArrayList<Integer>();
        ArrayList<Integer> mathList = new ArrayList<Integer>();

        while (true) {
            System.out.println("1: 추가, 2: 검색, 3: 수정, 4: 삭제, 5: 전체출력, 6: 탈출");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if (ch == 1) {
                System.out.print("이름: ");
                nameList.add(scanner.nextLine());
                System.out.print("국어 점수: ");
                korList.add(scanner.nextInt());
                System.out.print("영어 점수: ");
                engList.add(scanner.nextInt());
                System.out.print("수학 점수: ");
                mathList.add(scanner.nextInt());
                scanner.nextLine();
            } else if (ch == 2) {
                System.out.print("검색할 학생 이름: ");
                String searchName = scanner.nextLine();
                int index = nameList.indexOf(searchName);
                if (index != -1) {
                	int total = korList.get(index) + engList.get(index) + mathList.get(index);
                    double avg = total / 3.0;
                    System.out.println("이름: " + nameList.get(index) + ", 국어: " + korList.get(index) + ", 영어: " + engList.get(index) + ", 수학: " + mathList.get(index)+ ", 총합: " + total+ ", 평균: " + avg);
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 3) {
                System.out.print("수정할 학생 이름: ");
                String searchName = scanner.nextLine();
                int index = nameList.indexOf(searchName);
                if (index != -1) {
                    System.out.print("새 국어 점수: ");
                    korList.set(index, scanner.nextInt());
                    System.out.print("새 영어 점수: ");
                    engList.set(index, scanner.nextInt());
                    System.out.print("새 수학 점수: ");
                    mathList.set(index, scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("수정 완료.");
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 4) {
                System.out.print("삭제할 학생 이름: ");
                String searchName = scanner.nextLine();
                int index = nameList.indexOf(searchName);
                if (index != -1) {
                    nameList.remove(index);
                    korList.remove(index);
                    engList.remove(index);
                    mathList.remove(index);
                    System.out.println("삭제 완료.");
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 5) {
                for (int i = 0; i < nameList.size(); i++) {
                	int total = korList.get(i) + engList.get(i) + mathList.get(i);
                    double avg = total / 3.0;
                    System.out.print("이름: " + nameList.get(i) + ", 국어: " + korList.get(i) + ", 영어: " + engList.get(i) + ", 수학: " + mathList.get(i));
                    System.out.println(  ", 총합: " + total+ ", 평균: " + avg);
                }
            } else if (ch == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}