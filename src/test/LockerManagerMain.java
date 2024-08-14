package test;

import java.util.Scanner;

public class LockerManagerMain {

	public static void main(String[] args) {
		LockerManager lockerS = new SLocker();
		LockerManager lockerB = new BLocker();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1번 사물함 사용, 2번 물건 찾기, 3번 사물함 조회, 4번 뒤로가기");
			int num = scan.nextInt();
			if (num == 1) {
				System.out.println("사물함을 선택해 주세요 (1.1~10 작은 사물함 2.11~15 큰 사물함)");
				int sel = scan.nextInt();
				if(sel == 1) {
					lockerS.Lent();
				}else if(sel == 2) {
					lockerB.Lent();
				}else {
					System.out.println("다시 입력해 주세요.");
				}
				
			} else if (num == 2) {
				System.out.println("사물함을 선택해 주세요 (1.1~10 작은 사물함 2.11~15 큰 사물함)");
				int sel = scan.nextInt();
				if(sel == 1) {
					lockerS.Turn();
				}else if(sel == 2) {
					lockerB.Turn();
				}else {
					System.out.println("다시 입력해 주세요.");
				}
			} else if (num == 3) {
				lockerS.Serch();
			} else if (num == 4) {
				System.out.println("돌아갑니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("==============================================");

		}

	}

}
abstract class LockerManager{
	Scanner scan = new Scanner(System.in);
	Locker locker[] = new Locker[10];
	Locker2 locker2[] = new Locker2[5];
	public abstract void Lent();
	
	public abstract void Turn();
	public void Serch() {
		System.out.println("사물함 조회 1.작은 사물함 2.큰 사물함");
		int ser = scan.nextInt();
		if(ser == 1) {
			for(int i =0; i<locker.length; i++) {
				if(locker[i] != null) {
					System.out.println("사물함 : " + ser);
					System.out.println("이름 : " + locker[i].getName());
					ser++;
					System.out.println();
					}else {
						break;
					}
				
			}
		}else if(ser == 2) {
			for(int i =0; i<locker2.length-1; i++) {
				if(locker2[i] != null) {
					System.out.println("사물함 : " + locker2[i].getNumber());
					System.out.println("이름 : " + locker2[i].getName());
					System.out.println();
					}else {
						break;
					}
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
}



class SLocker extends LockerManager{

	@Override
	public void Lent() {
		System.out.println("사용하실 사물함 번호를 입력해 주세요.(1~10)");
		int lo = scan.nextInt()-1;
		int lo1 = lo+1;
		if (locker[lo] == null) {
			locker[lo] = new Locker();
			locker[lo].setNumber(lo);
			System.out.println("사물함 "+lo1);
			System.out.println("이름 입력: ");
			locker[lo].setName(scan.next());
			
			
		} else {
			System.out.println("사용중인 사물함 입니다.");
		}
	}
	
	@Override
	public void Turn() {
		System.out.println("1~10 입력");
		int lo = scan.nextInt() - 1;
		if (locker[lo] != null) {
			locker[lo] = null;
			System.out.println("사물함을 반납했습니다.(요금 5000원)");
		} else {
			System.out.println("사물함이 비어있습니다.");
		}
	}
	
}

class BLocker extends LockerManager{
	
	@Override
	public void Lent() {
		System.out.println("사용하실 사물함 번호를 입력해 주세요.(11~15)");
		int lo = scan.nextInt()-11;
		int lo1 = lo+11;
		if (locker2[lo] == null) {
			locker2[lo] = new Locker2();
			locker2[lo].setNumber(lo);
			System.out.println("사물함 "+lo1);
			System.out.println("이름 입력: ");
			locker2[lo].setName(scan.next());
			
			
		} else {
			System.out.println("사용중인 사물함 입니다.");
		}
		
	}
	
	@Override
	public void Turn() {
		System.out.println("11~15 입력");
		int lo = scan.nextInt() - 11;
		if (locker2[lo] != null) {
			locker2[lo] = null;
			System.out.println("사물함을 반납했습니다.(요금 10000원)");
		} else {
			System.out.println("사물함이 비어있습니다.");
		}
	}
}


class Locker{
	String name;
	int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
class Locker2{
	String name;
	int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

