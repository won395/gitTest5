package day10;

public class GenericD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"Hello","World"};
		GenericClassD<String> ge01 = new GenericClassD();
		ge01.set(str);
		ge01.print();
		
		int [] inArr = { 1, 2, 3, 4};
		
		Integer [] arr = {0, 1, 2, 3};
		GenericClassD<Integer> ge02 = new GenericClassD();
		ge02.set(arr);
		ge02.print();
		
		
	}

}

//제네릭: 타입의 정의가 되지 않을떄 사용
//제네릭 커스텀 x (클래스에 대한 설계 이해도)
//읽을 줄 알면 된다!!
//제네릭 <> <= 이거 사용했을떄 제네릭
//제네릭은 대문자 하나만 사용한다 하고싶은거 약자로 사용
//k key, T type E element 등등
class GenericClassD<T> {
	int [] arr = new int[5];
	T[] v;
	
	public void set(int[] a) {
		
	}
	
	public void set(T[] n) {
		v = n;
	}
	
	//getter 오버로딩
	public void print(int arr1) {
		//배열 출력 (기존 포문 조건에 부합
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//항상 포문 for foreach(반복문 설명할때)
		//배열을 표현하기 위해사용(배열 출력)
		//for(배열타입 변수명[정의 가능] : 배열변수명[재정의x])
		for(int reference : arr) {
			System.out.println(reference);
		}
	}
	
	public void print() {
		//항상 for문, forEath
		for(T s: v) {
			System.out.println(s);
		}
	}
}