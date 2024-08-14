package day04;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반 변수 선언
		int num = 10;
		
		//배열 선언
		int arr [] = new int[5];
		arr[0] = 500;
		arr[1] = 300;
		arr[2] = arr[0]+arr[1];
		System.out.println("0번방: "+arr[0]);
		System.out.println("1번방: "+arr[1]);
		System.out.println("2번방: "+arr[2]);
		//tip, int 타입은 null이 없음
		//널이 없기때문에 없으면 0으로 표시됨
		System.out.println("3번방: "+arr[3]);
		
		//배열의 공간을 찾는 방법은 [ ] <= 대괄호
		//소괄호 묶고, 중괄호 묶고 대괄호 묶는다 => 컴퓨터에서 쓸수없는 방법
		//소괄호는 계산 우선순윌,ㄹ 결정할때 사용
		//중괄호는 if, for, while, method, class 등 시작과 종료를 의미
		//대괄호는 배열의 위치(인덱스)를 가리킬떄 사용
		
		//배열 시작값은 항상 0부터입니다(사람은 1부터 읽는다)
		
		//String 5개
		String [] strArr = new String[5];
		strArr[0] = "홍길동";
		strArr[1] = "슈퍼맨";
		strArr[2] = "베트맨";
		strArr[3] = "짱구";
		strArr[4] = "철수";
		
		System.out.println(strArr[2]);
		System.out.println(strArr[1]);
		

	}

}
