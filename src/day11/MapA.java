package day11;

import java.util.HashMap;
import java.util.Map;

public class MapA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map: 키와 벨류로 구성
		//map의 key는 중복을 허용하지 않는다
		//map은 키를 통해서 값을 찾아오기떄문에
		//값을 불러오기 위해서는 키가 필요하다
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("abc", "슈퍼맨");
		map.put("def", "배트맨");
		
		map.put("def", "홍길동");  //키중복 x
		
		System.out.println(map.get("abc"));
		System.out.println(map.get("def"));
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(1, "가나다");
		map2.put(2, "슈퍼맨");
		
		System.out.println(map.get(1));
		System.out.println(map.size());
		
		Map<Integer, StuMap> map3 = new HashMap<Integer, StuMap>();
		StuMap stuMap = new StuMap();
		
		stuMap.setNum(1);
		stuMap.setName("슈퍼맨");
		
		map3.put(stuMap.getNum(). stuMap);
		System.out.println(map3.get(1).getName);
		//map 데이터 기공할떄 많이 사용한다
		//다른 회사에서 만든 프로그램 그 데이터를 불러올떄 주로 사용
		//나 혹은 상대가 코드를 수정하게되면 데이터를 못받경우가 발생할 수있다
		//키를 상대쪽 변수명
		//벨류를 상대쪽에서ㅓ 주는 값으로 지정
		
		//map을 사용해서 학생 성적 마들기

	}

}

class StuMap {
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
