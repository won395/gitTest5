package day12;

public class Runnable01 implements Runnable {

	public static void main(String[] args) {
		
		Runnable t1 = new Runnable01();
		Thread thread = new Thread(t1);
		System.out.println("check");
		thread.start();

	}
	
	@Override
	public void run() {
		System.out.println("실행 체크하기");
	}

}
