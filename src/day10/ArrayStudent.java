package day10;

import java.util.*;

//Arrat = > ArrayList로 변형
//1번 추가
//2번 검색
//3번 수정
//4번 삭제
//5번 전체 출력

public class ArrayStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();
		
		
		while(true) {
			System.out.println("1번 입력, 2번 이름검색, 3번 수정, 4번 삭제, 5번 전체 출력");
			int num = scan.nextInt();
			if(num == 1) {
				System.out.println("이릅 입력");
				String name = scan.next();
				System.out.println("국어 점수");
				int korScore = scan.nextInt();
				System.out.println("수학 점수");
				int mathScore = scan.nextInt();
				System.out.println("영어 점수");
				int engScore = scan.nextInt();
				student.add(new Student(name, korScore, mathScore, engScore));
				
			}else if(num == 2) {
				System.out.println("검색할 학생 이름 입력 : ");
				String find = scan.next();
				for(int i = 0; i<student.size(); i++) {
					if(student.get(i).getName().equals(find)) {
						System.out.println("이름 : "+ student.get(i).getName());
						System.out.println("국어 : "+ student.get(i).getKorScore());
						System.out.println("영어 : "+ student.get(i).getEngScore());
						System.out.println("수학 : "+ student.get(i).getMathScore());
						
					}
				
				}
				
			}else if(num == 3) {
				System.out.println("수정할 학생 이름 입력 : ");
				String edit = scan.next();
				for(int i=0; i<student.size(); i++) {
					if(student.get(i).getName().equals(edit)) {
						System.out.println("수정할 국어 점수 : ");
						student.get(i).setKorScore(scan.nextInt());
						System.out.println("수정할 수학 점수 : ");
						student.get(i).setMathScore(scan.nextInt());
						System.out.println("수정할 영어 점수 : ");
						student.get(i).setEngScore(scan.nextInt());
					}
				}
				
			}else if(num == 4) {
				System.out.println("삭제할 학생 이름 입력 :");
				String remove = scan.next();
				for(int i=0; i<student.size(); i++) {
					if(student.get(i).getName().equals(remove)) {
						System.out.println("삭제 완료");
						student.remove(i);
					}
				}
				
			}else if(num == 5) {
				for(Student li : student) {
					System.out.println("이름 : "+ li.getName());
					System.out.println("국어 : "+ li.getKorScore());
					System.out.println("영어 : "+ li.getEngScore());
					System.out.println("수학 : "+ li.getMathScore());
				}
				
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}

	}

}

class Student{
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;
	
	public Student(String name, int korScore, int engScore, int mathScore ) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
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
