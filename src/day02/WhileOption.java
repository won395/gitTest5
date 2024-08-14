package day02;

public class WhileOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		while(true) {
			
			if(num > 100) {
				break;
			}
			if(num % 5 == 0) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
			
			//break;
			//continue
		}
	}

}
