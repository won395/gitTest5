package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//collection  상속받는것중 하나가 리스트
		//리스트는 어레이 사용할떄 불편
		
		//크기를 조정할수없다
		//배열을 관리할수있는 클래스를 만들자
		//데이터를 추가, 삭제, 검색
		//넣는 즉시 배열의 크기를 조절 //편하다
		
		//배열은 크기가 안바뀜
		//어레이리스트 특별하니까 애는 안바뀐다는 것은 아니다
		//추가할떄마다 배열을 지웠다가 다시 만듭니다
		//느리다 Arraylist 사용할떄는 배열의 길이가 정의가 되지 않을때
		
		ArrayList<String> list = new ArrayList<String>();
		//String[] ar = new String[5]; //기존의 배열(정적배열)
		
		//추가
		//변수명.add(값(ref));
		list.add("슈퍼맨");
		list.add("베트맨"); //인덱스를 모르니까 add를 씀
		list.add("홍길동");
		
		//list의 내용을 Iterator에게 복사해서 건네준다
		Iterator<String> it = list.iterator();
		
		list.add("홍길동"); //실행하면 오류 while문으로 안들감 그래서 출력을 안시켜줌 결론 안됨
		
		//사본가져왔는데 컴터가 멍청해서해이 몇갠지 모르떄
		//다음값이 존재 여부 = it.hasNext();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
		//for문을 이용
		//어레이 리스트의 길이는 size() [length x]
		for(int i = 0; i < list.size(); i++) {
			//arr[i]
			//출력하고 싶은 인덱스를 알 경우에 list.get(i)
			System.out.println(list.get(i));
		}
		//편의성떄문에 만들어진 것
	
	
	for(String li: list) {
		System.out.println();
	}

	}
}