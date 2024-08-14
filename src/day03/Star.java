package day03;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				System.out.printf(" * ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		//2번
		
		for(int i= 0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				
				System.out.printf(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3번
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("   ");
			}
			for(int j = 0; j<5-i; j++) {
				System.out.printf(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4번
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.printf("   ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.printf(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		//5번
		for(int i=0; i<4; i++) {
			for(int j=4; j>i; j--) {
				System.out.printf("   ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.printf(" * ");
			}
			System.out.println();
		}
		for(int i =0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("   ");
			}
			for(int j=2*5-1; j>2*i; j--) {
				System.out.printf(" * ");
			}
			System.out.println();
		}

	}

}
