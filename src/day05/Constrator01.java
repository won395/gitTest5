package day05;

public class Constrator01 {
	//접근제어자 + 생성자명(클래스 명하고 동일)
	//method하고 다른 것으 리턴 타입 적지 않습니다.
	//사용하지 않을 때, 아래형태는 default로 저장 됩니다.
	//메모리기 할당 될때 (이형태로 실행)
	public Constrator01() {
		System.out.println("생성");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public Constrator01(String text) {
			System.out.println("입력내용: ");
		}
		
		public void print() {
			System.out.println("method");
		}
		
		
			Constrator01 constrator01 = new Constrator01();
			new Constrator01("abcd");
			constrator01.print();
			String str = new String("여깃다가");
		
		

	}

}
