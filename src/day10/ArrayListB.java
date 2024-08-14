package day10;
//
//컴퓨터 사양이 개똥이면 *(전체불러오기) 금지
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<> (타입 정의 안된 리스트)
		//장수
		ArrayList<Integer> list = new ArrayList();
		
		//추가
		list.add(100);
		list.add(300000000);
		list.add(-500);
		
		//1. Iterator 사용
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Integer element = it.next();
			System.out.println(element);
		}
		
		//2. for문 시용
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
