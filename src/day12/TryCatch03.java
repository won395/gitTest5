package day12;

public class TryCatch03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//try catch finally => 힌트를 제공하는 목적
		//우리가 에러를 컨트롤하기 위해서 이용한다
		//try catch는 쓰기도 귀찮고 힌트 제공도 하지 말아라
		
		//throws Exception => 힌트 무시
		TryCatch03.print();

	}
	
	public static void print() throws Exception {
		String str = null;
		System.out.println(str.equals(str));
	}

}

