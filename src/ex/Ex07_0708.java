package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex07_0708 {

    public static void main(String[] args) {
    	//2. 4자리숫자 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("네 자리 숫자를 입력하세요:");

        int input = sc.nextInt();

        if (input >= 1000 && input <= 9999) {
            ArrayList<Integer> list = new ArrayList<>();

            // 각 자리 숫자를 추출하여 리스트에 추가 		//요기부터
            list.add(input / 1000);					//
            list.add((input / 100) % 10);			//
            list.add((input / 10) % 10);			//
            list.add(input % 10);					//여기까지 챗gpt가 만듦

            // 리스트를 오름차순으로 정렬
            Collections.sort(list);

            // 정렬된 숫자를 출력
            System.out.print("정렬된 숫자: ");
            for (int num : list) {
                System.out.print(num);
            }
            System.out.println();
        } else {
            System.out.println("네 자리 숫자가 아닙니다.");
        }
    }
}
