package day10;

//제네릭 < > 이거 안에  있으면 제네릭
//제네릭 규칙은 대문자 한글자만 있으면 됨 

public class GenericB<K, E> {
	private K key;
	private E value;
	
	public void set(K k, E e) {
		key = k;
		value = e;
	}
	
	//key -  value => json
	//자바 -> 맵. 배열의 인덱스가 아니라 키를 통해 값을 찾는다
	//for로만 찾기는 힘들 수 있다
	
	//배열 외워야하는것 인덱스: 배열 안에서 찾기 쉽도록 도와주는 역할
	//인덱스를 숫자 0~ 배열의 ㅇㅇ
	
	public E get(K k) {
		if (key == null) {
			if(k == null) {
				return value;
			}
		}else if (key.equals(k)) {
			return value;
		}
		return null; //키가 일치하지 않으면 널 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericB<String, String> example = new GenericB();
		example.set("key1", "valuel");
		
		System.out.println(example.get("key1"));
		System.out.println(example.get("valuel"));

	}

}

