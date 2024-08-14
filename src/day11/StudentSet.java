package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Student1> studentset = new HashSet<Student1>();
		Student1 stu = new Student1();
		while(true) {
			System.out.println("1번 입력, 2번 이름검색, 3번 수정, 4번 삭제, 5번 전체 출력");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("이릅 입력");
				stu.setName(sc.next());
				System.out.println("국어 점수");
				stu.setKorScore(sc.nextInt());
				System.out.println("수학 점수");
				stu.setMathScore(sc.nextInt());
				System.out.println("영어 점수");
				stu.setEngScore(sc.nextInt());
				
				studentset.add(stu);
			}else if(num == 2) {
				System.out.print("검색할 이름: ");
		        String name = sc.next();
		        
		        for(Student1 li:studentset) {
		        	if(li.getName().equals(name)) {
		        		System.out.println(li.getName());
		        		System.out.println(li.getKorScore());
		        		System.out.println(li.getEngScore());
		        		System.out.println(li.getMathScore());
		        	}else {
		        		System.out.println("그런 사람 없습니다");
		        	}
		        }
			}else if(num == 3) {
				System.out.print("수정할 학생의 이름: ");
		        String name = sc.nextLine();
		        
		        for (Student1 li:studentset) {
		            if (li.getName().equals(name)) {
		                System.out.print("새 국어 점수: ");
		                li.setKorScore(sc.nextInt());
		                System.out.print("새 영어 점수: ");
		                li.setEngScore(sc.nextInt());
		                System.out.print("새 수학 점수: ");
		                li.setMathScore(sc.nextInt());
		                sc.nextLine(); 
		                System.out.println("학생 정보가 수정되었습니다.");
		                return;
		            }System.out.println("학생을 찾을 수 없습니다.");
		        }
			}else if(num == 4) {
				 System.out.print("삭제할 학생의 이름: ");
			        String name = sc.nextLine();

			        for (Student1 li:studentset) {
			            if (li.getName().equals(name)) {
			                System.out.println("학생 정보가 삭제되었습니다.");
			                studentset.remove(li);
			                return;
			            }
			        }
			        System.out.println("학생을 찾을 수 없습니다.");
			}else if(num == 5) {
				
		        for (Student1 li:studentset) {
		            	System.out.println(li.getName());
		            	System.out.println(li.getKorScore());
		            	System.out.println(li.getEngScore());
		            	System.out.println(li.getMathScore());
		        }
		    }else {
		    	System.out.println("잘못 입력했습니다");
		    }
		}
	}
}




class Student1{
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;
	
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


