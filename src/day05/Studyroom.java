package day05;

import java.util.Scanner;

public class Studyroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스 관리 시스템
		//스터디룸 5개를 관리하는 관리자
		//인덱스0: 101호, 인덱스02: 102호.. 등
	//1번 입실, 팀명, 사람수 입력 받고, 2번 퇴실 (저장된 값을 모두 지우시오(null) 3번 현재 대여 인원 모두 출력
		
		Scanner sc = new Scanner(System.in);
		ClassRoom [] clr = new ClassRoom[5];
		
		while (true) {
			System.out.println("1.입실 2.퇴실 3.현재 대여인원 출력 -1.나가기");
			int n = sc.nextInt();
			
			if (n == 1) {
				System.out.println("입실할 방번호입력: ");
				int room = sc.nextInt();
				if(clr[room] == null) {
					clr[room] = new ClassRoom();
					System.out.println("팀명: ");
					clr[room].setTeamName(sc.next());
					System.out.println("인원수: ");
					clr[room].setCount(sc.nextInt());
				} else {
					System.out.println("오류");
				}
				
			} else if (n == 2) {
				System.out.println("퇴실할 방번호입력: ");
				int room = sc.nextInt();
				if(clr[room] == null) {
					System.out.println("퇴실되셨습니다.");
				}
			} else if (n == 3) {
				for(int i = 0; i<5; i++) {
					if(clr[i] == null) {
						System.out.println(clr[i].getTeamName()+clr[i].getCount());
					} else if(n == -1) {
						break;
					} else {
						System.out.println("잘못된 입력");
					}
				}
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
