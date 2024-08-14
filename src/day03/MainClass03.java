package day03;

public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		Animal animal = new Animal();
		
		animal.name = "고양이";
		System.out.println(car.name);
		System.out.println(animal.name);
		System.out.println(animal.sound);
		

	}

}

class Animal {
	String name;
	String sound = "야옹";
}

class Car {
	String name = "테슬라";
}
