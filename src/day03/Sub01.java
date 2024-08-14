package day03;

public class Sub01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//별만들기 1번(5x5)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//별만들기 2번(계단)
		for(int i = 0; i < 5; i++) {
			//여기서 j<(i+1) => i+1한 이유는 i가 0부터 시작하기 때문에
			//i가 0부터 시작하므로 1행과 0은 1차이가 나타난다 +1을 해주는 것
			for(int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//별만들기 3번(역계단)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" "); //공백
			}
			for(int j = 0; j<5-i; j++) {
				System.out.print("*"); //별
			}
			System.out.println();
		}
		System.out.println();
		
		
		//별만들기 4번(피라미드)
		for(int i=0; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(" "); //공백
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//별만들기 5번 (마름모)
		for(int i=0; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*(5-i)-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
