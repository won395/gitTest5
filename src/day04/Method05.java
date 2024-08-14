package day04;

public class Method05 {
	
	
	//static 정의
	//메모리 할당은 java가 담당한다 우리가 이미 실행한 시점에서 프로젝드 내에 있는 static들을 모두 메모리 할당
	
	//java 메모리 할당. 데이터 공유.
	//그래서 java 메모리 할당을 주지않아도 직접 접근이 가능한 이유.
	
	static String name = "짱구"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method05 method05 = new Method05();
		method05.print();
		System.out.println(method05.name);
		
		Method05 method06 = new Method05();
		method06.name = "철수";
		System.out.println("=========");
		System.out.println(method05.name);
		System.out.println(method06.name);
		
		Method05
		

	}
	public void print() {
		System.out.println("print 호출");
	}

}
