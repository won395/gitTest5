package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add(1);
		Iterator<Integer> it1 = set1.iterator();
		//특정 값 찾기
		while(it1.hasNext()) {
			int num = it1.next();
			if(num == 1) {
				System.out.println("찾는 값이 1입니다.");
			}
			System.out.println(num);
		}
		
		//인덱스 = > 목차 (책의 목차, 책의 목록) set에는 인덱스가 없기 때문에 찾는 것이 불편함
		
		for(Integer li: set1) {
			System.out.println(li);
		}
		
		Set<StuA> set = new HashSet<StuA>();
		
		StuA stuA = new StuA();
		stuA.setName("슈퍼맨");
		stuA.setNum(1);
		
		set.add(stuA);
		
		stuA = new StuA();
		stuA.setName("배트맨");
		stuA.setNum(2);
		
		set.add(stuA);
		
		Iterator<StuA> it3 = set.iterator();
		while(it3.hasNext()) {
			StuA element = it3.next();
			System.out.println(element.getName());
			System.out.println(element.getNum());
		}

	}

}

//set을 활용해 성적관리

class StuA {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}