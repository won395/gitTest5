package day07;

public class Abs03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Par par = new So();
		par.display();
		par.dd();

	}

}

//상속 부모 => 자식
//코드 규칙은 항상 명시적
//추상 => 코드를 만들다가 안 만들었다
//만드는것은 자식의 몫
//추상 클래스
abstract class Par {
	public void display() {
		System.out.println("display");
	}
	
	//dd라는 메서드를 만들었는데 무슨 기능인지 모른다
	public abstract void dd();
	
	public void print() {
		System.out.println("good");
	}
}


class So extends Par {
	@Override
	public void dd() {
		System.out.println("dd");
	}
}
