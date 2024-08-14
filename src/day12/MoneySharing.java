package day12;

public class MoneySharing {
	private int sharedMoney = 20000;

	//쓰레드끼리 synchronized 동기화해서 사용
	//run: 실행중
	//wait: 실행중인 쓰레드에게 대기상태로 보내는 메서드
	//notify: 대기중인 쓰레드에게 run 상태인 쓰레드가 wait 되었을떄 그다음 후보
	//
	public static void main(String[] args) {
		MoneySharing moneySharing = new MoneySharing();
		Thread mamThread = new Thread(() -> moneySharing.takeMoney("Mam"));
		Thread sonThread = new Thread(() -> moneySharing.takeMoney("Son"));
		Thread dadThread = new Thread(() -> moneySharing.takeMoney("Dad"));
		
		mamThread.start();
		sonThread.start();
		dadThread.start();

	}


private synchronized void takeMoney(String name) {
	while (sharedMoney >= 1000) {
		sharedMoney -= 1000;
		System.out.println(name + "took 1000원, remaining money: "+ sharedMoney + "원");
		
		try {
			Thread.sleep(1000);
			if (sharedMoney >= 1000) {
				notifyAll(); //권한을 다른 쓰레드에게 넘김
				wait(); //다른 쓰레드가 작업을 완료함때까지 대기
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
}