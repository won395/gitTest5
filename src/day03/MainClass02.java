package day03;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동";
		int kor = 100;
		int math = 90;
		int eng = 90;
		
		String name1 = "짱구";
		int kor1 = 50;
		int math1 = 30;
		int eng1 = 30;
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(math);
		System.out.println(eng);
		
		System.out.println(name1);
		System.out.println(kor1);
		System.out.println(math1);
		System.out.println(eng1);
		
		Score score = new Score();
		score.name = "유리";
		score.kor = 80;
		score.math = 90;
		score.eng = 85;
		
		System.out.println(score.name);
		System.out.println(score.kor);
		System.out.println(score.math);
		System.out.println(score.eng);
		
		Score scorel = null;
		//실제적으로 데이터 저장 공간
		//Score scorel = new Score();
		
		String str = new String("Hello");
		String str2 = new String("World");
		String str3 = "Hello";
		String str4 = "Hello";
		
		System.out.println(1 == 1);
		System.out.println(str == str3);
		System.out.println(str3 == str4);
		
		???
	}

}

//VO : Value Object
class Score {
	String name;
	int kor;
	int math;
	int eng;
	String str;
	String str2;
	String str3;
	String str4;
}
