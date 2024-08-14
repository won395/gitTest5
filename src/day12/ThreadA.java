package day12;


//컴퓨터의 모든 기능은 프로세스
//컴퓨터에서 프로세스 하나만
//프로세스는 하나만 실행이 된다 프로세스를 쓰레드는 분할
//프로세스 : 1쓰레드 => 여러개로 분할. 직렬, 병렬
//프로세스: 모든 쓰레드가 종료 되었을떄 프로세스가 종료된다
//1쓰레드는 (싱글 쓰레드) 2개이상 쓰레드(멀티 쓰레드)
public class ThreadA extends Thread {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.start();
		

	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("name: "+i+"번쨰");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
