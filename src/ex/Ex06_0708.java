package ex;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex06_0708 {

    public static void main(String[] args) {
    	
    	
        Scanner sc = new Scanner(System.in);
        int[] comNumbers = generateComNumbers();
        boolean gameEnd = false;
        
        System.out.println("게임 시작!");
        
        while (!gameEnd) {
            System.out.print("세 자리 숫자를 입력하세요: ");
            String userInput = sc.nextLine();
            if (userInput.length() != 3 || !userInput.matches("\\d{3}")) {
                System.out.println("잘못 입력했습니다. 숫자를 입력해주세요");
                continue;
            }
            
            int[] userNumbers = new int[3];
            for (int i = 0; i < 3; i++) {
                userNumbers[i] = Character.getNumericValue(userInput.charAt(i));
            }
            
            if (hasDuplicates(userNumbers)) {
                System.out.println("중복된 숫자가 있습니다. 다시 입력하세요.");
                continue;
            }
            
            int strikes = Strikes(comNumbers, userNumbers);
            int balls = Balls(comNumbers, userNumbers);
            
            System.out.println("스트라이크: " + strikes + ", 볼: " + balls);
            
            if (strikes == 3) {
                System.out.println("축하합니다! 숫자를 모두 맞췄습니다.");
                gameEnd = true;
            }
        }
   
    }

    private static int[] generateComNumbers() {
        Random random = new Random();
        Set<Integer> unique = new HashSet<>();
        while (unique.size() < 3) {
            unique.add(random.nextInt(9) + 1);
        }
        int[] numbers = new int[3];
        int index = 0;
        for (int num : unique) {
            numbers[index++] = num;
        }
        return numbers;
    }

    private static boolean hasDuplicates(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    private static int Strikes(int[] comNumbers, int[] userNumbers) {
        int strikes = 0;
        for (int i = 0; i < 3; i++) {
            if (comNumbers[i] == userNumbers[i]) {
                strikes++;
            }
        }
        return strikes;
    }

    private static int Balls(int[] comNumbers, int[] userNumbers) {
        int balls = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && comNumbers[i] == userNumbers[j]) {
                    balls++;
                }
            }
        }
        return balls;
    }
}
