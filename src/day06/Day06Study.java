package day06;

import java.net.MulticastSocket;

public class Day06Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 사용
		//100을 저장하고 싶어.
		int num = 100;
		
		//데이터 저장 (변수 저장 방법)
		String hello = "Hello World";
		boolean check = true;
		
		//데이터 사용할 때 캐스팅
		//정수 => 실수
		float fl = (float) 100;
		float fl2 = 100F;
		System.out.println(fl);
		System.out.println(fl2);
		
		//실수 => 정수
		int num2 = (int) 100.5;//소수점 모두 제거 (내림)
		System.out.println(num2);
		
		//한 번 정의된 변수는 데이터 타입을 변셩할수 없다
		//데이터 타입을 변경하기 위해서는 기존 데이터 저장된 변수와 
		//변경할 데이터 타입의 변수 즉, 변경 전 과 변경 후가 둘다 필요하다.
		//변수가 사라지는 시점은, 변수가 선언 된 부분의 중 괄호가 종료 되었을 때
		
		
		
		//데이터 타입 => 배열
		//같은 타입의 집합이 모인 구문
		//Array. (배열)
		//String, String, String
		//int, int, int
		
		//무조건 배열 사용하느냐, 그건 아니다
		//배열 10개
		//int타입
		//정수. (수학,영어,국어)
		//배열 100개. 철수, 짱구, 유리.
		//0번째 인덱스가 국어점수인지, 영어 점수, 수학점수인지 알 수 없기 때문
		//0번째 인덱스가 누구의 점수인지 알 수 없기 때문
		
		//배열을 사용할 때는 공통적인 규칙은 만들고 사용
		//수학점수 끼리의 집합, 총 점수끼리의 집합.
		//수학점수끼리의 집합 (0,1,2,3)<=출석번호
		int engScore1 = 100;
		int engScore2 = 90;
		int engScore3 = 80;
		
		//배열 사용 방법
		//배열을 정의할때는 항상 길이가 정의
		//배열은 1번째가 0 인덱스이다,즉 0부터 시작한다
		
		
		int [] engScore =new int[3];
		engScore[0] = 100;
		engScore[1] = 90;
		engScore[2] = 80;
		
		//배열이 아닌데 꺼낼 때
		System.out.println(engScore1);
		//배열을 출력
		System.out.println(engScore[0]);
		
		//배열 사용 방법 2.
		//배열을 생성할때부터 이미 값을 알고 있는 상태
		int [] mathScore = {100,90,80};
		System.out.println("철수 점수 : "+mathScore[1]);
		
		//배열의 길이
		//length => 길이
		//mathScore.length => mathScore=>배열로 정의 된 변수명
		//해당 변수의 길이. => 배열의 길이
		//반복문 사용할 때 대표적인 기능 ( 필드 )
		
		
		
		
		//조건문 ( ★ 컴퓨터의 기본 문법 )
		//조건문은 주어진 조건이 '참' 일때만 실행
		if(true) {
			
		}
		/*
		//알람 시계.
		if(현제시간 > 알람 정해진 시간) {
			
		}
		
		if(현제시간 > 도착시간) {
			
		}
		*/
		//선택이 필요할 때 사용하는 문법이 조건문
		//반드시 x, 누구는 좌측, 누구는 우측
		//홀수짝수, 알람시계.
		
		boolean check2 = 100 > 50; //true, false
		if(check2) {
			System.out.println("참");
		}else if(50 == 50) {
			System.out.println("두 번째 참");
		}else {
			System.out.println("거짓");
		}
		
		

	}

}
