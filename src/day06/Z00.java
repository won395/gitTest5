package day06;

public class Z00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rabit rabit = new Rabit();
		rabit.setName("몰랑");
		System.out.println(rabit.getName());
		rabit.run();
		rabit.goodfood();
		rabit.Color();
		
		Dog dog = new Dog();
		dog.setName("흰둥이");
		System.out.println(dog.getName());
		dog.run();
		dog.goodfood();

	}

}

class Animal02 {
	
	private String name;
	
	public void setName(String name ) {
		this.name = name;
	}
	public void getName(String name ) {
		this.name = name;
	}
	
	
	public void run() {
		System.out.println("앞으로 간다");
	}
	public void goodfood() {
		System.out.println("좋아한다");
	}
	
}

class Rabit extends Animal02 {
	
	//부모클래스가 정의한 메소드를 자식 클래스에서 재정의 한다
	@Override
	public void run() {
		System.out.println("토끼가 빨리 뛴다");
	}
	
	@Override
	public void goodfood() {
		System.out.println("당근을 먹는다");
	}
	
	public void Color() {
		System.out.println("흰");
	}
}

class Dog extends Animal02 {
	@Override
	public void run() {
		System.out.println("주인을 잘 따라간다");
	}
	@Override
	public void goodfood() {
		System.out.println("개껌을 먹는다");
	}
}
