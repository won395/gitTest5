package day06;

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//데이터타입 9개
		//기본 8개, 참조1개
		//(숫자 6개)
		//정수 4개
		//byte, short, int, Long. (int) <= 압도적으로 많이 쓰는데 95%
		
		//실수 2개
		//float, double <= 애는 숫자 범위보다, 실수 소수점 범위 문제라서
		//소수점을 많이 표현할 수록, 정수부분이 표현이 그만큼 줄어든다
		//double, 소수점 2자리 정도나온다. float, 소수점 10자리. 저장 double
		
		//논리 (1개)
		//boolean <= 메모리 사용량이 적어요. 2byte.class 컴퓨터는 항상 참 거짓
		//조건문, 참 거짓. 반복문, 참 거짓
		//알고리즘을 좀 잘하고 싶다 하면 친숙해져야 하는 타입
		//메모리 사용량이 적기 때문에 그만큼 효율이 나오기 좋은 타입
		//참인지 거짓인지를 보통 0과1로. int 타입
		
		//문자 (2개, 기본 1개, 참조 1개)
		//char //문자 하나만 저장이 가능하다.
		//char은 아스키 코드로 구성되어있다
		//문자를 표현하지만, 실제적으로는 숫자를 저장하는 타입
		//char가 문자를 숫자로 저장을 하다보니, 아래의 조건이 true.
		System.out.println(97 == 'a');
		
		//String 클래스
		//참조한다.
		//이미 하나를 만들어 놓고, 쓰고 싶을 때마다 재활용한다.
		//객체 지향 언어의 특징 (OOP),추상, 다형성
		//char의 배열 (문자 (배)열 )
		String str = "가나다";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
	}

}
