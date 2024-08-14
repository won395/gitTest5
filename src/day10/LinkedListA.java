package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		//데이터 중간에 삽입, 삭제가 자주 일어난다
		
		list.add("Hello");
		list.add("World");
		
		//출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //arraylist랑 linkedlist랑 쓰는 방식은 같지만 구조는 다르다
		}
		
		//collector 클래스는 list와 set의
		//list 크래스는 arraylist, linkedlist
		
		//상속 중일때 떠 올려야 하는 것  하나 동적바인딩
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new LinkedList<String>();
		
		
		}

	}

}
