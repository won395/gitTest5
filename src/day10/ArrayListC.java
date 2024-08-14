package day10;

import java.util.ArrayList;

public class ArrayListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인티저, 스트링 [참조타입]
		//클래스 하나 만들어서 사용 했음
		StuB [] arr1 = new StuB[5];
		
		ArrayList<StuB> list = new ArrayList<StuB>();
		StuB st1 = new StuB();
		st1.name = "배트맨";
		st1.num = 1;
		list.add(st1);
		
		st1 = new StuB();
		st1.name = "배트맨";
		st1.num = 1;
		
		//배열은 값을 담고 있는 주소등을 저장하는 곳
		list.add(st1);
		
		System.out.println(list.size());
	}

}
class StuB {
	String name;
	int num;
}