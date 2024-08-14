package day03;

public class Studnt02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu stu = new Stu();
		stu.name = "슈퍼맨";
		stu.math = 100;
		stu.kor = 100;
		stu.eng = 99;
		stu.print();
		System.out.println("합계: "+stu.sum());
		System.out.println("평균: "+stu.avg());
		
		Stu stu2 = new Stu();
		stu2.name = "배트맨";
		stu2.math = 99;
		stu2.kor = 95;
		stu2.eng = 98;
		stu2.print();
		System.out.println("합계: "+stu.sum());
		System.out.println("평균: "+stu.avg());

	}

}

class Stu {
	String name;
	int math;
	int kor;
	int eng;
	
	void print() {
		System.out.println(name);
		System.out.println(math);
		System.out.println(kor);
		System.out.println(eng);
	}
	
	int sum() {
		return math+kor+eng;
	}
	
	float avg() {
		return (math+kor+eng)/3F;
	}
}
