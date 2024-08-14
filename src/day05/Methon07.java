package day05;

public class Methon07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check class에 이름과 나이 가각 저징
		//Check 크래스에 저장된 이름과 나이를 출력
		
		Check check = new Check();
		check.setName("홍길동");
		check.setAge(10);
		
		System.out.println(check.getName()+check.getAge());
		
		//클래스 배열
		Check[] arr = new Check[3];
		String[] str = new String[2];
		str[0] = "가나다";
		arr[0] = new Check(); //실행하기 전에 이걸 추가 안하니까 실행 안됨 추가하니 실행됨
		arr[1] = new Check();
		arr[2] = new Check();
		
		arr[0].setName("짱구");
		arr[1].setName("슈퍼맨");
		arr[2].setName("배트맨");
		
		arr[0].setAge(5);
		arr[1].setAge(50);
		arr[2].setAge(30);
		
		System.out.println(arr[0].getName()+"\t"+arr[0].getAge());
		System.out.println(arr[1].getName()+"\t"+arr[1].getAge());
		System.out.println(arr[2].getName()+"\t"+arr[2].getAge());
		
		//Check 1번쨰 슈퍼맨 50, 2번 배트맨 30
		

	}
	

}

class Check {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}