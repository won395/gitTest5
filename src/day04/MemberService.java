package day04;

public class MemberService {
	
	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}
	
		public boolean login(String id, String password) {
			if(id == "hong" && password == "12345") {
				if(id.equals("hong") && password.equals("12345")) {
					return true;
				} else {
					return false;
				}
			}
		
		public void logout(String id) {
			System.out.println("로그아웃 되었습니다.");
		}
	}

}
