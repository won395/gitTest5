package day03;

public class Student02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu stu = new Stu();
		stu.name = "슈퍼맨";
		stu.mathScore = 100;
		stu.korScore = 100;
		stu.engScore = 99;
		
		stu.print();
		System.out.println("합계: "+stu.sum());
		System.out.println("합계: "+stu.avg());
		
		Stu stu2 = new Stu();
		stu2.name = "배트맨";
		stu2.mathScore = 99;
		stu2.korScore = 95;
		stu2.engScore = 98;
		stu2.print();
		System.out.println("합계: "+stu2.sum());
		System.out.println("합계: "+stu2.avg());

	}

}

class Stu{
	String name;
	int korScore;
	int mathScore;
	int engScore;
	
	void print() {
		System.out.println(name);
		System.out.println(korScore);
		System.out.println(mathScore);
		System.out.println(engScore);
	}
	
	int sum() {
		return korScore+mathScore+engScore;
	}
	
	float avg() {
		return (korScore+mathScore+engScore)/3F;
	}
}

