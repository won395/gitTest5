package day11;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map :  key와 value로 구성
		//map의 key는 중복을 허용하지 않습니다
		//map는 key를 통해서 값을 찾아오기 때문
		//값을 불러오기 위해서는 key가 필요합니다
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("abc","슈퍼맨");
		map.put("def","배트맨");
		
		map.put("def","홍길동");
		
		System.out.println(map.get("abc"));
		System.out.println(map.get("def"));
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(1, "가나다");
		map2.put(2, "슈퍼맨");
		
		System.out.println(map2.get(1));
		System.out.println(map2.size());
		
		Map<Integer, StuMap> map3 = new HashMap<Integer, StuMap>();
		StuMap stuMap = new StuMap();
		
		stuMap.setNum(1);
		stuMap.setName("슈퍼맨");
		
		map3.put(stuMap.getNum(),stuMap);
		
		System.out.println(map3.get(1).getName());

	}

}

class StuMap{
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
