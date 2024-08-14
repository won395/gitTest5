package study;

public class StuVO {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
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
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int getSum() {
		return this.korScore + this.engScore+ this.mathScore;
	}
	public float getAvg() {
		return getSum()/3F;
	}
}
