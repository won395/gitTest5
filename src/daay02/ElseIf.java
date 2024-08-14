package daay02;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("true"); //먼저 true가 나와서 2번쨰 참값은 안나옴
		}
		else if(true) {
			System.err.println("2번쨰 true"); // 결과 x
		}
		
		else {
			System.out.println("false");
		}
		
		if(1000 > 5000 ) {
			System.out.println("1000이 5000보다 크다");
		}
		else if(1000 > 300) {
			System.out.println("100은 300보다 크다");
		} else {
			System.out.println("a");
		}

	}

}
