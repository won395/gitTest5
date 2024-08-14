package daay02;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		if(true) {
			str = "abc";
		} else {
			str ="def";
		}
		
		str = (true) ? "abc" : "def";
		System.out.println((100 > 50) ? "true" : "false");
		System.out.println((100%2==0) ? "짝수" : "홀수");
		
		
	}

}
