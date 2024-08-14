package day06;

public class Method11 {
	
	//1. 잡근제어자
	//public: 전체 공유 (프로잭트 내, 모든 패키지에 공유)
	//default: 같은 패키지만 공유( 사용 방법: 접근제어자 제거, 기본 접근 제어자 ex) public 없애면 된다)
	//private: 자신의 클래스 내에서만 사용이 가능합니다 (공유 안됨) outter class에는 사용을 못한다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//타입 선언
		//ObjectVO objectVO = null;
		//onjectvo 만듦 -> 저장가는한 공간 확보해줘
		
		//new ObjectVO();
		//내가 이전에 확보해둔 곳에 실제로 데이터를 저장함
		//하드웨어(메모리) 사용할거야라고 통보
		ObjectVO objectVO = new ObjectVO();
		objectVO.setName("짱구");
		objectVO.setKor(50);
		objectVO.setEng(86);
		objectVO.setMath(55);
		
		//이런건 가능하다
		//vo규칙은 국, 영, 수 한번에 넣는거 만들었다
		//기존의 setkor 지워도 된다 (x)
		//만든건 어디까지나 본인을 위한 기능
		//나만 쓰는게 아니라 나중에는 컴퓨터가
		objectVO.setScore(50, 86, 55);
				
		objectVO.getName();
		
		//ObjectVO objectVO1 = new ObjectVO(100);
		//ObjectVO objectVO2 = new ObjectVO(100);
		
	}

}

//Value Obtect (값을 담는 객체)
//ObjectVO에서만 사용이 접근 가능한 필드
//데이터를 직접 접근하지 못하게 함으로써, 데이터를 보호
//OOP 특징 중 하나, 캡슐화
class ObjectVO {
	private String name;	//이름
	private int kor;		//국어
	private int eng;		//영어
	private int math;		//수학
	//final int SCORE = 100;
	
	//생성자는 필드 바로 아래 메소드 선언부분은 제일 윗부분
	//생성자 규칙 접근제어자 + 클래스명([매개변수])
	//메소드하고 큰차이는 리턴타입이 없다
	//생성자 언제 사용하는냐, 메모리가 할당될떄 딱 1번
	//지금 생성자 정의 안했다 지금 이 클래스 생성자가 있다
	//정의된 생성자가없을경우, 클래스 생성x
	//생성자를 만들지 않을때만, 생략이 된다
	//생성자 쓰는 이유, class 생성할 때 default값이 있을 경우 만든다
	public ObjectVO() {
		this(null, 0, 0, 0);
	}
	
	//오버로딩
	public ObjectVO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public ObjectVO(String name) {
		this.name = name;
	}
	
	
	//맨 앞글자가 대문자는 class 단어마다 앞글자 "파스칼케이스"
	//맨 앞글자가 대문자가 상수 변하지 않는 값 final 변수 모두 대문자
	public void setScore( int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setScore(String name, int kor, int eng, int math) {
		//this => 자기자신(클래스)
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//위에하고 동작 이유같다(역할 점수 넣는다(저장))
	//나중에 누가됮지 모르겠지만, 내코드를 보는 사람이 있다면 미리 만들어놨으니 너가 알아서 선택해서 써라(오버로딩)
	//이름이 덩일한 메서드를 만들수 있다 대신 조건이 맞는다면
	//오버로딩 <정의 규칙>
	//1.매기변수 갯수
	//2.매개변수타입(순서가 동일하지않아도 오버로딩 적용)
	
	//접근 가능하도록 접근제어자는 public
	//method
	//메소드에서 제일 중요한것, *리턴타입*
	//기본타입 8개 + 참조타입1개(참조타입: 클래스)
	//void (리턴 타입이 없다), 아예 못쓰는건 아님
	//접근 제어자 리턴 타입 메소드명([매개변수]) {}
	public String getName() {
		return name; // 리턴: 현재 구문 종료
	}
	//매개변수 호출한 곳에서 값을 받을떄 사용하는 기능
	// 호출한 곳 입장에서는 이 method에게 값을 줄 떄 사용
	//매개변수: 메소드냉에서만 사용할 수 았더.
	//void 또한 return 쓸 수 있다 (void return을 쓸수
	//return구문이 반드시 필요하지 않는 리턴타입은 => void
	//return은 항상 하나만 저달 항 수 있다 (값 x)
	//return에는 vo도 리턴되고, 배열도 리턴이 가능하다
	
	//vo 규칙
	//getter setter 반드시 있어야됨
	//암묵적인 규칙 <= 모든 개발자들이 습관처럼 따르는 것
	//내가 안쓴다고해서 안만드는게 아니라 남이 쓸수 있는것
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
