package day05;

public class Constrator03 {
	
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;
	
	
	
	public Constrator03() {
		
	}
	
	public Constrator03(String name, int korScore, int engScore,int mathScore) {
		this.name = name;
		this.korScore =korScore;
		this.engScore = engScore;
		this.mathScore =mathScore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrator03 c1 = new Constrator03();
		c1.setName("홍길동");
		c1.setKorScore(100);
		c1.setEngScore(100);
		c1.setMathScore(100);
		
		Constrator03 c2 = new Constrator03("배트맨",90,95,100);
		System.out.println(c2.getMathScore());
		
		
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}


}


