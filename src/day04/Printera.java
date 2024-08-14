package day04;

public class Printera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painter p = new Painter();
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");

	}
}
class Painter{
	void println(int n) {
		System.out.println(n);
	}
	void println(boolean n) {
		System.out.println(n);
	}
	void println(double n) {
		System.out.println(n);
	}
	void println(String n) {
		System.out.println(n);
	}
}
