package day05;

import java.util.Scanner;

public class ClassRoomManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * 클래스 관리 시스템
		 * 스터디룸 5개를 관리하는 관리자 입니다
		 * 인덱스0: 101호, 인덱스 1: 102호...
		 * 
		 * 1번 - 입실, 팀명, 사람수 입력 받기
		 * 2번 - 퇴실 (저장 된 값을 모두 지우시오, null)
		 * 3번 - 현재 대여 인원 모두 출력 
		 * 
		 * 만든것은 제출	 
		*/
		ClassRoom[] arr = new ClassRoom[5];
		while(true) {
			System.out.println("사용 할 기능을 입력해주세요. 1: 입실, 2: 퇴실, 3:사용인원");
			int num = s.nextInt();
			if(num == 1) {
				System.out.println("방 번호 선택 1.101호, 2.102호, 3.103호, 4.104호, 5.105호");
				int sel = s.nextInt()-1;
				if(arr[sel]==null) {
					arr[sel] = new ClassRoom();
					System.out.println("팀 명 입력: ");
					arr[sel].setTeamName(s.next());
					System.out.println("인원 수 입력: ");
					arr[sel].setCount(s.nextInt());
				}else {
					System.out.println("사람이 있습니다.");
				}
				
			}else if(num == 2) {
				System.out.println("방 번호 선택 1.101호, 2.102호, 3.103호, 4.104호, 5.105호");
				int sel = s.nextInt()-1;
				
				if(arr[sel] != null) {
					System.out.println("퇴실 되셨습니다.");
					arr[sel] = null;
				} else {
					System.out.println("사람이 없습니다.");
				}
				
			}else if(num == 3) {
				int a = 101;
				for(int i = 0; i<5; i++) {
					if(arr[i] == null) {
						System.out.println(a+"번방은 비어있습니다.");
						a++;
					} else {
						System.out.println( a+"번방 : ");
						System.out.println(a+"번방 : (팀명 : " + arr[i].getTeamName() + " 사람 수 : " + arr[i].getCount()+")");
						a++;
					}
					
				}
			}else {
				System.out.println("잘못된 번호 입니다.");
			}
		}
		

	}

}
class ClassRoom {
	private String teamName;
	private int count;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
