package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class day11 {

	public static void main(String[] args) {
		//stack - heap
		//기본타입은 예외였습니다. ( stack에 값을 저장하는 형태 )
		//비교 할 때 '=='되는 이유가 stack에 값을 저장하고 있기 때문에 가능
		//편하려고 기본타입을 만들었습니다
		
		//byte = > Byte ( 앞 글자 대문자 => class(참조) )
		long lo2 = 100L;
		long lo1 = 100L;
		
		//int
		int in1 = 100;
		Integer in2 = 100;
		
		//제네릭
		//1. 기본타입은 사용이 불가능. (참조 형태로 사용이 가능하다 )
		//2. class를 만들 때, 필드의 타입이 정의 되지 않은 경우
		//3. 제네릭 사용 방법은 한 글자, 대문자 사용하시면 됩니다. ex: T(type), K(key), V(value)
		//4. 난 모르겠다 하시면 그냥 List 사용 방법만 외우셔도 됩니다
		
		//배열
		//Collection FrameWork.
		//List, Set, java: 1990
		//json: 1995(2000년 이후), key: value. (다른 언어끼리 데이터를 주고 받습니다. )
		//stack - heap, json => Map
		
		//List
		String [] strArr = new String[5];
		String [] strArr2 = new String[6];
		//String 5개 입력, ej cnrk gkrhtlvek
		
		
		//List
		//사용할 때마다 메모리가 늘어났다가 줄어든다
		//생성할 때 크기 지정할 수 있지만 결국에는 초과도면 늘어납니다
		
		//Java 사용할 때 한 가지 규칙
		//변수타입은 변형 할수 없다. ( 배열의 길이 포함 )
		//List라는 특징이 늘어나면 기존의 값을 지우고, 다시 만듭니다.
		//기존의 Array보다는 느립니다. ( 생성, 수정, 삭제를 편리하기 위해 만들어 짐 )
		ArrayList<String> str1 = new ArrayList<String>();
		LinkedList<String> str2 = new LinkedList<String>();
		
		//List를 상속 하고 있으니, 원할 때마다 골라서 쓸 수 있다
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList();
		
		//값 추가
		list1.add("Hello");
		//특정 값 출력
		System.out.println(list1.get(0));
		
		//리스트 내용 완전 삭제
		list1.clear();
		//list의 길이
		list1.size();
		//list 특정 값 삭제
		list1.remove(0);
		
		//Set
		//0, 1, 2, 3, 4
		//배열: 같은 타입의 집합.
		Set<String> set;
		set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		Iterator<String> it1 = set.iterator();
		//시작할 때, (포인터, 커서)
		while(it1.hasNext()) {
			String element = it1.next();
			System.out.println(element);
		}
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.add(1);
		set2.add(2);
		
		set2.add(1);
		
		Iterator<Integer> it2 = set2.iterator();
		//시작할 때, (포인터, 커서)
		while(it2.hasNext()) {
			int element = it2.next();
			System.out.println(element);
		}
		
	}
	
}
