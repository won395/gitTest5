package day10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set은 인덱스 x
		//set은 key 개념으로 데이터를 가지고 옵니다
		//값으로 호출 // 중복값 x
		HashSet<String> set = new HashSet<String>();
		StudentSet stu1 = new StudentSet();
		stu1.name = "슈퍼맨";
		stu1.num = 90;
		
		StudentSet stu2 = new StudentSet();
		stu2.name = "슈퍼맨";
		stu2.num = 90;
		
		StudentSet stu3 = new StudentSet();
		stu3.name = "슈퍼맨";
		stu3.num = 90;
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		System.out.println(set.size());
		
		//set 정렬을 바라는거 x
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

	}

}

class StudentSet {
	String name;
	int num;
}

@Override
public boolean equals(Object obj) {
	if(obj instanceof StudentSet) {
		StudentSet stu = (StudentSet) obj;
		return stu.name.equals(name) && (stu.num == num);
	} else {
		return false;
	}
}
@override
public int hashCode() {
	return name.hashCode()+num;
}
