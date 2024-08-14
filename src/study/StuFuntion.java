package study;

import java.util.List;
import java.util.Scanner;

public class StuFuntion {

	StudentDAO dao = new StudentDAO();
	Scanner sc = new Scanner(System.in);
	
	public void insert() {
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("국어 점수");
		int korScore = sc.nextInt();
		System.out.println("영어 점수");
		int engScore = sc.nextInt();
		System.out.println("수학 점수");
		int mathScore = sc.nextInt();
		dao.insert(name, korScore, engScore, mathScore);
		System.out.println("성공!");
	}
	
	public void select() {
		List<StuVO> list = dao.select();
		
		for(StuVO li : list) {
			System.out.print(li.getName()+"\t");
			System.out.print(li.getKorScore()+"\t");
			System.out.print(li.getEngScore()+"\t");
			System.out.print(li.getMathScore()+"\n");
		}
	}
	
	public void update() {
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("국어 점수");
		int korScore = sc.nextInt();
		System.out.println("영어 점수");
		int engScore = sc.nextInt();
		System.out.println("수학 점수");
		int mathScore = sc.nextInt();
		dao.update(name, korScore, engScore, mathScore);
		System.out.println("성공!");
	}
	
	public void delete() {
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		dao.delect(name);
	}

}
