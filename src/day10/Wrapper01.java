package day10;

public class Wrapper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//책 p.521
		
		//변수타입 기본다입 8개<스트링 아닌 수 둘> + 참조타입 1개 스트링
		
		//스택 - 힙의 연관 관계
		//기본타입은 예외 (== 으로 비교가 되기때문)
		//스택은 값을 저장하는게 아니라 실제 메모리에 저장된 공간을 가리키는 주소
		
		// 컴퓨터가 사용할 수 있는 이유는 필요할떄 스택을 통해서 힙의 값을 불러오기 떄문
		
		//위의 대표적인 타입을 (참조) - 스트링, 클래스, 어레이 등 사용(기본)
		//참조형을 사용 할떄, 비교 할 시 == 이 아닌라 이퀄 함수를 통해서
		
		//제네릭 => 기본타입은 사용할 수없다
		//인트, 바이트, 이런 기본타입 변수는 사용할 수 없다
		
		//기본 타입
		byte by = 100;
		short sh = 1000;
		int in = 100000;
		Long lo = 100000L;
		
		//참조타입 =>앞글자 대문자면 클래스
		//기본 => 참조(객체, class)형태로 바꾸는것을 박싱
		Byte byw = new Byte(by);
		System.out.println(byw);
		Short shw = new Short(sh);
		//int만 외워줘 풀넴
		Integer inw = new Integer(in);
		Long low = new Long(10);
		
		//참조 => 기본 언박싱
		by =0;
		by=byw.byteValue();
		System.out.println(by);
		
		//배열 하나ㅏ

	}

}
