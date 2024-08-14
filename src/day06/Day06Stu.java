package day06;

public class Day06Stu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		
		//데이터 저장(변수저장 방법)
		String hello = "Hello Wolrd";
		boolean check = true;
		
		//데이터 사용할떄, 캐스팅
		//정수 => 실수
		float f1 = (float) 100;
		float f12 = 100F;
		System.out.println(f1);
		System.out.println(f12);
		
		//실수 => 정수
		
		int num2 = (int) 100.5; //소수점 모두 제거
		System.out.println(num2);
		
		//한번 정의 된 변수는 데이터 타입을 변경할 수없다
		//데이터 타입을 변경하기 위해서는 기존 데이터를 저장된 변수와
		//변경 할 데이터 타입의 변수. 즉, 변경 전과 변경 후 둘다 필요하다
		//변수가 사라지는 시점은, 변수가 선언된 부분의 과호가 종료 되었을 떄
		
		//데이터 타입 => 배열
		//같은 타입의 지합이 모인 구문
		//Array (배열)
		//String, String, String  // int, int, int
		
		//무저건 배열을 사용하는냐, 그건 아니다
		//배열 10개
		//int 티입
		//점수 (국, 영, 수)
		//배열 100개, 1,2,3
		//0번쨰 인덱스가 국어점수인지 영어 점수인지 모룸
		
		//배열을 사용할떄는 공통적인 규칙을 만들고
		//수학점수끼리의 집합, 총 점수끼지의 집합
		//수학점수끼리의 집합 (0,1,2,3) <= 
		int eng1 = 100; //짱구
		int eng2 = 90;  //철수
		int eng3 = 80;  //유리
		
		//배열 사용법
		//배열을 정의할떄는 항상 길이가 정의되어야 한다
		//먼저 공간을 확보하고, 그다음 숫자를 채우는 방식
		//배열은 1번째가 0인덱스이다. 즉, 0부터 시작함
		int [] eng = new int[3];
		eng[0] = 100;
		eng[1] = 90;
		eng[2] = 80;
		
		//배열이 아닌 것 출력
		System.out.println(eng1);
		//배열 출력
		System.out.println(eng[0]);
		
		//배열 사용법2
		//배열을 생성할떄부터 이미 값을 알고 있는
		int [] math = {100, 90, 80};
		System.out.println("철수 점수: "+math[1]);
		
		//배열의 길이
		//length => 길이
		//math.length => math => 배열로 정의된 변수명
		//해당 변수의 길이 => 배열의 길이
		//반복문 사용할때 대표적인 기능 (필드)
		
		//조건문 (* 컴퓨터의 기본 문법 *)
		//조건문은 주어진 조건이 참 일떄만
		if(true) {
			
		}
		
		//알람시계
		/*
		if(현재시간 > 알람 정해진 시간 ) {
			
		}
		*/
		//선택이 필요할때 사용하는 문법이 조건문
		//반드시 x 누구는 좌측, 누구는 우측
		//홀수 짝수, 알람시계
		
		boolean check2 = 100 > 50; //true, flase
		if(check2) {
			System.out.println("참");
		} else if (50 == 50) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

	}

}
