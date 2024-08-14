package ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09_0708 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("6개의 숫자를 입력하세요 (숫자는 한개씩 입력하시오):");
        int[] cards = new int[6];
        for (int i = 0; i < 6; i++) {
        	System.out.println(i+1+"번쩨 숫자 입력");
            cards[i] = sc.nextInt();
        }

        if (isValidSet(cards)) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

    }

    // 숫자 배열이 유효한지 확인하는 메소드
    private static boolean isValidSet(int[] cards) {
        // 숫자 개수를 세기 위한 맵
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : cards) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        // 3개의 같은 숫자가 존재하는지 확인
        int tripleCount = 0;
        for (int count : countMap.values()) {
            if (count >= 3) {
                tripleCount++;
            }
        }

        // 정렬된 배열을 사용하여 연속된 숫자 3개 확인
        Arrays.sort(cards);
        int consecutiveCount = 0;
        for (int i = 0; i < 4; i++) {
            if (cards[i] + 1 == cards[i + 1] && cards[i + 1] + 1 == cards[i + 2]) {
                consecutiveCount++;
                i += 2; // 연속된 숫자를 처리했으므로 건너뜀
            }
        }
        // 3개의 같은 숫자와 연속된 숫자의 총합이 2 이상이어야 함 아마도?
        return (tripleCount + consecutiveCount) >= 2;
    }
}
