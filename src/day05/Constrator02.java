package day05;

public class Constrator02 {
	private String name;
	public Constrator02() {
		this.name = "class";
	}
	public Constrator02(int num) {
		this.name ="10";
	}
	
	public void getPrint() {
		System.out.println();
	}
	
	public void print() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrator02 c1 = new Constrator02();
		Constrator02 c2 = new Constrator02(10);
		c1.getPrint();
		c2.getPrint();

	}

}
