package day07;


//인터페이스
//다중 상속
//코드를 명시적으로 작성할 수없다 {} <= 이거 못 사용함
//여기서 선언되는 변수는 없다 다 상수임
//자바의 대표적인 추상 => 인터페이스
public interface Inter {
	
	//상수를 하기 위해서는 항상 final 정의 [class에서]
	//인터페이스는 변수를선언하는 즉시 바로 상수
	int AAA = 1000; // <= 이거 상수 [변하지않는 값]
	
	public void print();
	
	//더하는 기능을 갖고있다 (매개변수 하나만 받는다)
	public int add(int num);

}
