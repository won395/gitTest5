package day13;

public class JavaStudy {

	//JAVA
	//JAVA복습 + JDBC.
	public static void main(String[] args) {

		//데이터타입과 변수명.
		//stack - heap.
		// 기본타입 8개 (값을 stack 저장 ) / 참조타입 1개. (stack - heap )
		
		//숫자 ( 정수, 실수 )
		//최근들어서 메모리 사양이 너무 좋다. 
		//byte, short, int, long => int만 적어도 외주셔야 합니다. ( 유지 보수 가기 힘든 환경 )
		//float, double => double
		//논리
		// boolean => true, false ( 조건문, 반복문(조건) ) <= 1byte. 메모리 효율적 0: false, 1
		
		//문자
		// char => 문자 특징: 작은따음표, 문자 하나! '가'
		// char는 문자를 저장하는 것이 아니라 (숫자.) => 1, 스키코드 2, 유니코드.
		char ch = 'a';
		System.out.println(100 == 100);
		System.out.println('a' == 97);
		
		//참조 ( String ) 앞글자 대문자~ class
		String str = "hello";
		
		// String pool <= 이 친구가 메모리 관리를 도와준다.
		String str2 = "hello";
		System.out.println(str == str2); //true 이 이유는 string pool 가능 한 현상.
		
		System.out.println(str.equals(str2));	//String 비교 방법.
		
		
		//조건문 if( 참 , 거짓 ( 논리 타입 ) )
		if(true) {
			//if가 참 일때~ 실행이 됩니다.
		}
		
		boolean check = 100 < 50;	// 참인지 거짓인지 구분 해준다.
		System.out.println(check);
		
		if(check) {
			//여기는 동작이 안 됩니다.
			System.out.println("여기는 동작이 안 됩니다.");
		}
		//이 else if 위치 기준으로, 위에가 모두 false일 때, 그 때 기회 옵니다.
		//만약 이 else if가 true이면 실행이 되고, 현재 if문은 종료.
		else if(100 == 100) {
			System.out.println("2번째 기회");
		}
		//if가 동작이 되지 않을 경우, 나머지가 실행 됩니다.
		else {
			System.out.println("false");
		}
		
		// < , > , == <= 얘네들을 '비교 연산자'
		//if는 비교 연산자를 통해서 비교 했다면, switch는 값을 통해서 비교 합니다.
		// switch는 괄호안에 value이 들어갑니다.
		// switch 사용 할 때는, break 기억하세요.!
		// switch는 if보다 메모리 효율이 좋습니다.
		switch(6) {
		case 1:
			System.out.println("1번");
			break;
		case 5: case 6:
			System.out.println("5번");
			break;
		case 7:
			System.out.println("7번");
			break;
		case 9:
			System.out.println("9번");
		default :
			System.out.println("else 역할");
		}
		
		//반복문
		// while, do - while, for ( forEach )
		//초기값, 조건값, 증감값 ( 무한 루프 방지 하기 위해)
		//while은 괄호 안이 조건이 true일 때, 실행이 됩니다.
		int num = 0;	//초기 값
		while(num < 10) { // 조건 값
			System.out.println("num: "+num);
			num++;	//증감값
		}
		
		
		//do - while
		//while하고 비슷한데, 무조건 한 번은 실행 합니다!
		// num = 0; //초기값
		do {
			System.out.println("do - while");
			System.out.println("num: "+num);
			//num++; 증감값
		} while(num < 10); // 조건
		
		//for문~ (초기문; 조건문; 증감문) <= 조건문은 반드시 있어야 합니다. ( 없으면, 무한 루프 )
		for(int i = 0; i< 10; i++) {
			System.out.println("i: "+i);
		}
		
		
	}

}

