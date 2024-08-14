package day10;

public class GenericA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<String> str = new GenericClass();
		str.setValue("Hello");
		System.out.println(str.getValue());
		
		GenericClass<Integer> in = new GenericClass();
		in.setValue(100);
		System.out.println(in.getValue());
		

	}

}

//T: type의 약자
//type을 커스텀 해서 사용

class GenericClass<T>{
	
	//변수선언시 : 접근제어자 변수타입 변수명;
	//접근제어자(생략 default)
	//변수타입 : int String 이런 애들
	//변수명 대명사, 별칭, 이름
	private T value;

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}