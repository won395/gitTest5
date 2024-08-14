package day03;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Texi texi = new Texi();
		texi.setCustomer("홍길동");
		texi.setStartingPoint("");
		texi.setDestination("");
		
		System.out.println(texi.getCustomer());
		System.out.println(texi.getStartingPoint());
		System.out.println(texi.getDestination());

	}

	
	//접근제어자
	//public, protected, default, private
	//public: 같은 프로잭트 안에서 어디에서든 접근이 가능하다
	//public 지갑 <= 누구나 갖고 갈 수있는 지갑
	
	//protected: 같은 패키지 + 상속받은 클래스 (사용하는데 잘 안씀)
	
	//default: 가장 기본 접근제어자, 생략이 가능하다 같은 패키지 내에서만 가능
	
	//private:  자기자신 (같은 클래스에서만 접근이 가능하다)
	
	//접근제어자 사용하는 곳
	//클래스 생성, 변수 선언(필드), 메서드 선언
}


//VO, 객체지향언어 => 캡슐화, 추상
//setter, getter
//set 필드명()
//해당 필드(변수)에 데이터를 저장하는 역할
//get 필드명()
//해당 필드에 저장된 데이터를 return하는 역할

class Texi {
	private String customer;
	private String startingPoint;
	private String destination;
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
