package day12;

import java.util.Scanner;

public class TryCatch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try catch를 이용해서 입력 받은 문자가 숫자인지 비교
		String str = "abc"; //문자
		String str1 = "123"; //타입은 문자 / 숫자를 문자로 저장
		
		Scanner sc = new Scanner(System.in);
		String strQue = sc.next();
		
		//입력 받은 문자가 숫자일 때 정상적으로 출력이 됩니다
		//입력 받은 문자가 숫자가 아니면 error가 발생 됩니다
		//try가 무사히 종료 되면 성공
		//catch가 한 번 이라도 발생 되면 '실패'
		//Exception 사용하면 안됩니다.
		
		//int num = Integer.parseInt(strQue);
		
		//입력 받은 문자가 숫자인지 확인 하는 구문을 만들 것 입니다
		//try - catch
		
		try {
			int num = Integer.parseInt(strQue);
		}
		catch(NumberFormatException e){
			System.out.println("숫자 아님");
		}
		catch(Exception e) {
			//모든 에러를 아날로그 형태로 보여주는것
			//상황에 따라서 쓸지 안쓸지 
		}
		finally {
			System.out.println(strQue);
		}

	}

}
