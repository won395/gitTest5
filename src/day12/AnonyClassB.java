package day12;

public class AnonyClassB {
	
	interface Test {
		public void print();
	}
	//public class

	public static void main(String[] args) {

	}

}

Test test = () -> {
	System.out.println("display");
};

test.print();
}
