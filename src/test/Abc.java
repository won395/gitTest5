package test;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//He
		//내가 사용하는 것이 무슨 데이터 타입인지 아려줘야함
		
		//문자, 숫자, 논리
		//타입은 총 9개
		//기본 타입 8개, 참조타입1개(String)
		
		//숫자
		//정수
		//byte, short, int, Long (int를 많이 씀)
		//byte 1byte => 8bit => 2의 8제곱 즉 127
		//short => 3만 2천
		//int =>21djr
		//Long 21억보다 높은 숫자를 받을때
		
		//실수 2개
		//float double(double)
		//float 4byte (int하고 크기가 비슷)
		//double 8byte (Long)
		//double 소수점 2자리정도 나오고 float는 소수점 10자리까지 나옴
		
		//논리
		//boolean //true, false (참, 거짓)
		//메모리 사용량이 적기 떄문에 그만큼 효율이 좋다
		//10보다 5가 크다 <= 거짓, boolean type은 false
		
		//문자
		//char 'a', 'b' 등등
		//사람이 읽을떄만 문자 컴퓨터가 읽을떄는 숫자 (기준은 아스키코드)
		//한글, 일본어 ,한문 어린애들은 유니코드
		//문자를 표현하지만 숫자를 저장함
		
		//String => Hello word.
		//참조한다
		//이미 하나를 만들어놓고 쓰고싶을때 씀
		//객체지향언어의 특징(OOP), 추상,
		//char가 12개 모여서 글자 완성, char의 배열(문자열)
		
		//char의 배열
		
		System.out.print(1010);
		
		System.out.print("hello"); //문자 사용시, 앞뒤로 큰따옴
		
		char a = 'a';
		String b = "b";
		
		//값을 저장하기 위해서 변수를 사용한다
		//변수를 변하는값을 저장하는 공간
		
		//무슨 갑ㄱ을 저장하는데 타입이 우선순위
		//타입 [변수명(임의)] = 값
		String name ="짱구";
		
		System.out.print(name);
		System.out.print(name);
		
		int num = 101;
		System.out.print(num);
		
		System.out.print(num+50);
		
		//변수 사용시 주의사할
		//한번 저의된 변수 타입은 변수가 사라지지않는 이상 계속해서 유지
		num = 1000;
		
		//변환 시킨다 (캐스팅, 강제 형변환)
		float f1 = (float)num;
		float ss = (float)5/2; //정수하고 정수계산되므로 (float) 붙여야됨
		
		//문자 => 숫자
		String str1 = "122";
		int num1 = Integer.parseInt(str1);
		System.out.print("str1: "+num);
		//숫자 => 문자
		int num2 = 555;
		String str2 = Integer.toString(num2);
		System.out.print("str2"+num2);

	}

}
