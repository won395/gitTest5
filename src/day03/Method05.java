package day03;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score02 score02 = new Score02();	//소문자: 메소드랑 필드명만 가능
		
		score02.setName("홍길동");
		score02.setKor(100);
		score02.setEng(90);
		score02.setMath(95);
		
		//\t는 tab버튼 눌렀을때의 길이만큼 뛰어쓰기
		//\n은 enter의 개행을 의미한다
		System.out.println(score02.getName()+"\t");
		System.out.println(score02.getKor()+"\t");
		System.out.println(score02.getMath()+"\t");
		System.out.println(score02.getSum()+"\t");
		System.out.println(score02.getAvg()+"\n");

	}

}

class Score02 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() { //get 붙여서 사용하는것이 좋음
		return this.kor+this.eng+this.math;
	}
	
	public float getAvg() {
		return getSum()/3F;
	}
	
}
