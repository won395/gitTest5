package day05;

import java.util.Scanner;

public class StuManagerMain {

	/**
	 * 규칙 메인 메소드는 Scanner 관련 혹은 while 관련만 있어야 합니다. 배열의 입력, 검색, 수정, 삭제에 대한 모든 기능은
	 * StudentManager class가 담당합니다. Student클레스는 학생 성적을 담습니다. private 설정 되어 있어야 합니다.
	 * 
	 * 월요일까지 해오시면 되고, 한 분 발표 하겠습니다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		StudentManager manager = new StudentManager();
		Scanner scanner = new Scanner(System.in);
		// 1번 입력, 2번 이름검색, 3번 수정, 4번 삭제, 5번 전체 출력
		while (true) {
			System.out.println("1번 입력, 2번 이름검색, 3번 수정, 4번 삭제, 5번 전체 출력");
			int num = scanner.nextInt();
			if (num == 1) {
				manager.input();
			} else if (num == 2) {
				manager.output();
			} else if (num == 3) {
				manager.edit();
			} else if (num == 4) {
				manager.del();
			} else if (num == 5) {
				manager.total();
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("==============================================");

		}

	}

}

class StudentManager {

	Scanner scan = new Scanner(System.in);

	Student studentList[] = new Student[10];

	public void input() {
		System.out.println("1~10 입력");
		int sel = scan.nextInt() - 1;
		if (studentList[sel] == null) {
			studentList[sel] = new Student();
			System.out.println("이름 입력: ");
			studentList[sel].setName(scan.next());
			System.out.println("국어 점수: ");
			studentList[sel].setKorScore(scan.nextInt());
			System.out.println("수학 점수: ");
			studentList[sel].setMathScore(scan.nextInt());
			System.out.println("영어 점수: ");
			studentList[sel].setEngScore(scan.nextInt());
		} else {
			System.out.println("이미 값이 있습니다");
		}

	}

	public void output() {
		System.out.println("이름 입력");
		String str = scan.next();
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getName().equals(str)) {
				System.out.println("이름 : " + studentList[i].getName());
				System.out.println("국어 : " + studentList[i].getKorScore());
				System.out.println("수학 : " + studentList[i].getMathScore());
				System.out.println("영어 : " + studentList[i].getEngScore());
				break;
			}
		}

	}
	public void edit() {
		System.out.println("1~10 입력");
		int sel = scan.nextInt() - 1;
		if (studentList[sel].getName() != null) {
			System.out.println("이름 입력: ");
			studentList[sel].setName(scan.next());
			System.out.println("국어 점수: ");
			studentList[sel].setKorScore(scan.nextInt());
			System.out.println("수학 점수: ");
			studentList[sel].setMathScore(scan.nextInt());
			System.out.println("영어 점수: ");
			studentList[sel].setEngScore(scan.nextInt());
		} else {
			System.out.println("값이 없습니다.");
		}

	}
	
	public void del() {
		System.out.println("1~10 입력");
		int sel = scan.nextInt() - 1;
		if (studentList[sel] != null) {
			studentList[sel] = null;
		} else {
			System.out.println("값이 없습니다.");
		}
	}
	
	public void total() {
		for(int i =0; i<studentList.length; i++) {
			if(studentList[i] != null) {
			System.out.println("이름 : " + studentList[i].getName());
			System.out.println("국어 : " + studentList[i].getKorScore());
			System.out.println("수학 : " + studentList[i].getMathScore());
			System.out.println("영어 : " + studentList[i].getEngScore());
			System.out.println();
			}else {
				break;
			}
			
		}
		
	}

}

class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
}