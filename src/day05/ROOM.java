package day05;

import java.util.Scanner;

public class ROOM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ClassRoom [] clr = new ClassRoom[5];
		
		while (true) {
			System.out.println("1.입실 2.퇴실 3.현재 대여인원 출력 -1.나가기");
			int n = sc.nextInt();
			
			if (n == 1) {
				System.out.println("팀명:");
				String teamName = sc.next();
				System.out.println("인원");
				int index = sc.nextInt();
				
				if (index >=clr.length || index < 0) {
					System.out.println("잘못된 값");
				}
				
				clr[index] = new ClassRoom();
				clr[index].setTeamName(teamName);
				clr[index].setCount(cnt);
			} else if(n == 2) {
				System.out.println("호실");
				int index = sc.nextInt();
				clr[index] = null;
			} else if (n == 3) {
				for(int i = 0; i < clr.length; i++) {
					System.out.println(clr[i].getTeamName()+clr[i].getCount());
				}
				
				//for문 항상for문, forEach문
				//for(배열의 타입 reference명(for에서 사용하는 변수명): 배열 변
				for(ClassRoom li; classRoom) {
					System.out.println(clr[i].getTeamName()+clr[i].getCount());
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