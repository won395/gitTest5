package day12;

public class InnerClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerClassC.method();

	}
	
	//로컬 클래스는 메서드안에 선언합니다
	
	public static void method() {
		class InnerB {
			int num = 10;
		}
		
		InnerB innerB = new InnerB();
		System.out.println(innerB.num);
	}

}
