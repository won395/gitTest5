package ex;

import java.util.Scanner;

public class Ex08_0708 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("첫 번째 수를 입력하세요:");
        int start = sc.nextInt();
        
        System.out.println("두 번째 수를 입력하세요:");
        int end = sc.nextInt();
        
        
        if (start < 100 || start > 999 || end < 100 || end > 999) {
            System.out.println("두 수 모두 세 자리 수여야 합니다.");
            sc.close();
            return;
        }
        
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("오름차순 숫자:");
        
        for (int i = start; i <= end; i++) {
            int hund = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;
            
            if (hund < tens && tens < units) {
                System.out.println(i);
            }
        }
    }
}