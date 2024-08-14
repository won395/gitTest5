package day13;

public class Javastudnt {
	
	public static void main(String[] args) {
		// 데이터타입과 변수명
		//스택 - 힙
		// 기본타입 8개 (값을 스택에 저장) / 참조타입 1개 (스택 - 힙)
		
		//숫자(정수, 실수)
		//최근들어메모리 사양이 너무 좋다
		//byte, short, int, long => int만 적어도 외워야됨 (유지보수 가기 힘든 환경)
		//float, double => double
		
		//논리
		// boolean => true, false (조건문, 반복문(조건)) <= 1byte 메모리 효율 0: false, 1
		
		// 문자
		//char => 문자 특징: 작은 따옴표, 문자하나 '가'
		// char은 문자를 저장하는게 아니라 (숫자) => 1, 아스키코드 2, 유니코드
		
		//참조 (string) 앞글자 대문자 Class
		String str = "hello";
		
		//String pool <= 이친구가 메모리 관리를 도와준다
		
		// 조건문 if (참, 거짓 (논리타입))
		if(true) {
			//if가 참일때 실행이됨
		}
		
		boolean check = 100 < 50; // 참 거짓 구분
		System.out.println(check);
		
		if(check) {
			// 여기는 동작이 ㄷ안됨
			System.out.println("여기는 동작이 안됨");
		}
		// else if 위치 기준으로 위에가 모두 false일떄 그떄 기회가 옴
		// 만약 이 else if가 참이면 실행 현재 if문 종료
		//else if()
		
		
		//<,>,==, <= 애네들이 비교연산자
		//이프는 비교연산자를 통해서 비교했다면 스위치는 값을통해서 비교
		// 스위치는 괄호안에 벨류가 들어감
		// 스위치 사용할떄는 브레이크를 기억하시오
		switch(6) {
			case 1:
				System.out.println("1번");
			break;
			case 5: case 6:
				System.out.println("5번");
				break;
				default:
					System.out.println("Else 역할");
		}
		
		//반복문
		//while, do - while, for( foreach )
		//초기값, 조건값, 증감값(무한루트 방지하기 위해서)
		//while은 괄호안이 조건이 참일떄 실행이됨
		int num = 0; //초기값
		while(num < 10) { //조건값
			System.out.println("num: "+num);
			num++; //증감값
		}
		
		//do-while
		//while하고 비스한데 무조건 한번은 실행
		do {
			System.out.println("d0 -while");
			System.out.println("num: "+num);
			//num++; 증감값
		} while(num < 10); //조건
		
		//for문~ (초기문; 조건문; 증감문) <= 조건문은 반드시 있어야됩니다 (없으면 무한루프)
		for(int i = 0; i< 10; i++) {
			System.out.println("i: "+i);
		}
	}

}
