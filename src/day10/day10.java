package day10;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(100);
		System.out.println(3.14);
		
		//나 이 데이터 저장하고 싶어
		//컴퓨터는 무엇을 저장 할까?
		//숫자. 논리0, 1, 문자
		//숫자 메모리 낭비가 너무 심해서 나눠지기 시작.
		//byte, short, int, Long ( int: 214748 )
		
		//실수
		//float, double (double)
		//float 메모리 크기는 int 하고 비슷합니다.
		//int는 21억까지 표현 가능한데, float는 대략 10만 까지 표현
		
		//double => int가 표현하는 정수 크기하고 비슷
		
		//boolean
		//true, false, 조건문, 반복문 사용할 때 주로 사용하는데
		//알고리즘 요소 할 때, 그 때도 많이 사용합니다 (메모리 절약)
		
		//문자
		//위에 까지는 그냥 사용할 수 있었다
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		
		//문자부터는 따옴표 무조건 들어옵니다
		//작은 따옴표 하고 큰 따옴표
		//작은 따옴표: 포창기 때부터 썻던 문자 방식 => c
		char ch ='c';
		
		//String은 큰 따옴표 입니다.
		//애는 컴퓨터 역사 중간에 시작 됐습니다
		String str = "c";//(문자)의 배(열)
		
		//char의 배열로 String 하나가 만들어집니다.
		
		//String 기본 참조
		
		//공통 된 것 끼리 모이는 것이 OOP의 장점
		//String, int, int =>데이터 타입 (캨체) =>class
		
		//컬렉션
		//기본타입 x => int, char, boolean

	}

}

class Stu{
	String name;
	int num;
	int phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}