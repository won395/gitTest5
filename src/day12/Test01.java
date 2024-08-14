package day12;

public class Test01 {
	prinvar int sharedMoney = 20000;

	public static void main(String[] args) {
		MoneySharing moneySharing = new MoneySharing();
		Thread mamThread = new Thread(() -> moneySharing.takeMoney("Mam");
		Thread sonThread = new Thread(() -> moneySharing.takeMoney("Son");
		Thread dadThread = new Thread(() -> moneySharing.takeMoney("Dad");
		
		
		
		mam
		sonThread.start();
		dadThread.start();

	}

}

private synchronized void takeMoney(String name) {
	while (sharedMoney >= 1000) {
		sharedMoney -= 1000;
		System.out.println(name + "took 1000원, remaining money: "+ sharedMoney + "원");
		
		try {
			Thread.sleep(1000);
			if (sharedMoney >= 1000) {
				notifyAll();
				wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}