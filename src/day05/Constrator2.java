package day05;

public class Constrator2 {
	//접근제어자 + 생성자명(클래스 명하고 동일)
	//method하고 다른 것으 리턴 타입 적지 않습니다.
	//사용하지 않을 때, 아래형태는 default로 저장 됩니다. (생략)
	//메모리기 할당 될때 (이형태로 실행)
	//필드에 값이 필요했을 경우
	private String name;
	public Constrator2() { 
		this.name = "class";
	}
	public Constrator2(int num) {
		this.name ="10";
	}
	
	public void getPrint() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrator2 c1 = new Constrator2();
		Constrator2 c2 = new Constrator2(20);
		c1.getPrint();
		c2.getPrint();
		
		

	}

}
