package day05;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		
		//c.name="홍길동";
		//c.age=20;
		//System.out.println(c.name);
		//System.out.println(c.age);
		c.setName("홍길동");
		c.setAge(20);
		System.out.println(c.getName()); 
		System.out.println(c.getAge());
		
		String[] str = new String[2];
		str[0] = "가나다";
		
		Check[] arr = new Check[3];
		
		for(int i =0; i<arr.length; i++ ) {
			arr[i] = new Check();
		}
		
		
		//arr[0] = new Check();
		arr[0].setName("짱구");
		arr[0].setAge(5);
		System.out.println(arr[0].getName());
		System.out.println(arr[0].getAge());
		
		//arr[1] = new Check();
		arr[1].setName("슈퍼맨");
		arr[1].setAge(50);
		System.out.println(arr[1].getName());
		System.out.println(arr[1].getAge());
		
		//arr[2] = new Check();
		arr[2].setName("배트맨");
		arr[2].setAge(30);
		System.out.println(arr[2].getName());
		System.out.println(arr[2].getAge());

	}

}

class Check{
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