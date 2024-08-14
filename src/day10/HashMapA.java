package day10;

import java.util.HashMap;
import java.util.Set;

public class HashMapA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//json key: value
		//set의 중복제거와 검색 기능을 가지고 와서 사용하는 배열
		//기본적인 for x 인덱스 없음
		//구조는 key와 value
		//찾는것은 key
		//키는 중복허용 안함
		
		//키 중복값이 오면 이전의 키갑 버립니다
		//나중에 온 키값을 저장 함
		
		HashMap<Integer, String> map = new HashMap(); //<String, Student> 이렇게 써도됨
		map.put(1, "슈퍼맨");
		map.put(2, "슈퍼맨");
		map.put(3, "슈퍼맨");
		
		System.out.println(map.get(1)); //키값을 넣으면 출력 됨
		
		//키 전체를 가져와야함 근데 중복 안되자나
		Set<Integer> keyList = map.keySet();
		for(Integer key : keyList) {
			System.out.print("키값: "+key);
			System.out.println(" / value "+ map.get(key));
		}

	}

}
