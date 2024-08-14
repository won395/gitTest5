package day04;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

	}
	public class Printer {
		void println(int a) {
			System.out.println(a);
		}
		void println(String a) {
			System.out.println(a);
		}
		void println(double a) {
			System.out.println(a);
		}
		void println(boolean a) {
			System.out.println(a);
		}
	}

}
