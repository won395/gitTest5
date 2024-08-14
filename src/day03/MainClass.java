package day03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		System.out.println(name);
		Student std = new Student(); 
		//Student std == 데이터 타입
		//new Student(); 객체생성, 인스턴트화
		std.name = "홍길순";
		std.age = 50;
		System.out.println(std.name);
		System.out.println(std.age);
		
		Student std1 = new Student();
		std1.name = "청양";
		std1.age = 22;
		
		System.out.println(std1.name);
	}

}

class Student {
	String name;
	int age;
	
}
