package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wapperclass
		//자바에서는 기본타입 변수 8개
		//참조타입 1개 스트링
		
		//스택 - 힙
		//기본타입은 예외 (스택에 값을 저장하는 형태)
		//비교할떄 == 되는 이유가 스택에 값을 저장하고 있기떄문에 가능
		//편하려고 기본타입 만듦
		
		//byte => Byte (앞글자 대문자 => 클래스(참조))
		Long lo2 = 100L; //참조타입(앞글자 대문자)
		long l01 = 100L; //기본타입
		
		//int
		int in1 = 100; //기본
		Integer in2 = 100; //참조(앞글자가 대문자)
		
		//제네릭
		//1. 기본타입은 사용이 불가능(참조형태로 사용이 가능하다)
		//2. 클래스 만들때 필드의 타입이 정의 되지 않은 경우
		//3. 제네릭 사용방법은 한글자, 대문자 사용하시면 됨
		//4. 그냥 리스트 사용방법만 외워도 됨 모를경우에만
		
		//배열
		//Collection FrameWork
		//List, set, java: 1990
		//json: 1995(2000년 이후), key: value (다른 언어끼리 데이터를 주고 받음)
		//stack - heap, json =>Map
		
		//List
		String [] strArr = new String[5]; //java의 배열 특징
		String [] strArr2 = new String[6];
		//string 5개 입력, 더추가하고싶은디 
		
		//사용할때 마다 메모리가 늘어났다가 줄어든다
		//생성할떄 크기 지정할 수 있지만 결국에는 초과되면 늘어난다
		
		//자바 사용할때 한가지 규칙
		//변수타입은 변형할수없다( 배열의 길이 포함
		//리스트라는 특징이 늘어나면 기존의 값을 지우고 다시 만듦
		//기존의 Array보다 느림 (생성, 수정, 사제를 편리하기 위해 만들어짐
		ArrayList<String> str1 = new ArrayList<String>();
		LinkedList<String> str2 = new LinkedList<String>();
		
		//리스트를 상속하고 있으니 원힐때 마다 골라서 쓸수있다 동적바인딩
		List<String> list1 = new ArrayList<String>(); 
		List<String> list2 = new LinkedList<String>();
		
		//값 추가
		list1.add("Hello");
		//특정 값 출력
		System.out.println(list1.get(0));
		
		//리스트 내용 완전 삭제
		list1.clear();
		//list의 길이
		list1.size();
		//list 특정값 삭제
		list1.remove(0);
		
		//set
		//0 1 2 3 4
		//배열: 같은 타입의 집합
		//중복값 x
		//중복을 비교할때는 student 클래스는 같은 경우는 중복을비교할 수없다
		//hashcode, equals <= 오버라이드 해줘야 중복값 제거
		Set<String> set;
		set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		
		Iterator<String> it1 = set.iterator();
		//시작할떄 (포인터, 커서)
		while(it1.hasNext()) {
			String element = it1.next();
			System.out.println(element);
		}
		
		//속도떄문
		//10개 정도 (1억개) => 10초
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.add(1);
		set2.add(2);
		
		set2.add(1);
		
		Iterator<Integer> it2 = set2.iterator();
		while(it2.hasNext()) {
			Integer element = it2.next();
			System.out.println(element);
		}
		
		

	}

}
