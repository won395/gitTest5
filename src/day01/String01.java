package day01;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "언덕위의 나의 집";
		
		str = "house"; //이전 거를 지우고 새로운 문자를 지정하는 것
		System.out.println(str);
		
		//논리타입 boolean
		// ==: 같다, != 다르다, <=: 오른쪽값이 크거나 같다., >=:왼쪽 값이 크거나 작다 
		//>: 왼쪽값이 크고 같지 않다, <: 오르쪽값이 크고 같지않다
		System.out.println(10 == 10);
		
		String str1 = "apple";
		String str2 = "apple";
		System.out.println(str1 == str2);
		String str3 = new String("apple");
		System.out.println(str3);
		System.out.println(str1 == str3);
		
		//문자끼리 같다 비교 할 때
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}