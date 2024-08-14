package day11;

import java.util.*;


public class HashMapA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Student> map = new HashMap();
		Student stu = new Student();
		while(true) {
			System.out.println("1번 입력, 2번 이름검색, 3번 수정, 4번 삭제, 5번 전체 출력");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("이릅 입력");
				String name = sc.next();
				System.out.println("국어 점수");
				stu.setKorScore(sc.nextInt());
				System.out.println("수학 점수");
				stu.setMathScore(sc.nextInt());
				System.out.println("영어 점수");
				stu.setEngScore(sc.nextInt());
				
				map.put(name, stu);
			}else if(num == 2) {
				System.out.println("이릅 입력");
				String serch = sc.next();
				
				Set<String> keyList = map.keySet();
				for(String i :keyList) {
					if(i.equals(serch)) {
						System.out.println("이름 : "+i);
						System.out.println("국어 점수 : "+map.get(i).getKorScore());
						System.out.println("수학 점수 : "+map.get(i).getMathScore());
						System.out.println("영어 점수 : "+map.get(i).getEngScore());
					}else {
						System.out.println("이미 있습니다");
					}
				}
			}else if(num == 3) {
				System.out.println("수정할 이름을 입력해주세요.");
				String update = sc.next();
				
				Set<String> keyList = map.keySet();
				
				for(String n :keyList) {
					if(n.equals(update)) {
						System.out.print("국어 점수: ");
						stu.setKorScore(sc.nextInt());
						System.out.print("영어 점수: ");
						stu.setEngScore(sc.nextInt());
						System.out.print("수학 점수: ");
						stu.setMathScore(sc.nextInt());
						map.put(n, stu);
						System.out.println("수정 되었습니다.");
					}
				}
			}else if(num == 4) {
				System.out.print("삭제할 학생의 이름을 입력해 주세요: ");
				String del = sc.next();
				Set<String> keyList = map.keySet();
				
				for(String n :keyList) {
					if(n.equals(del)) {
						map.remove(n);
					}
				}
			}else if(num == 5) {
				Set<String> keyList = map.keySet();
				System.out.println(" 학생 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
				
				for(String i : keyList) {
					System.out.println("이름 : "+i);
					System.out.println("국어 : "+map.get(i).getKorScore());
					System.out.println("수학 : "+map.get(i).getMathScore());
					System.out.println("영어 : "+map.get(i).getEngScore());
					
				}
			}else {
				System.out.println("다시 입력하세요");
			}



	}

	}
}

class Student{
	
	private int korScore;
	private int mathScore;
	private int engScore;
	
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
}
