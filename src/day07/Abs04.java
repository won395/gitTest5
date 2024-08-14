package day07;

public class Abs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inter 코드를 가독성이 있게 만들기위해서 사용
		Inter inter = new Inter02();
		inter.print();
		inter.add(50);
	}

}

//상속할떄 extends => 단일 상속 할때만 클래스를 상속할떄만
//상속할떄 implement => 다중 상속 할때만 인터페이스만 사용 ㄱㄴ
class Inter02 implements Inter{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(AAA);
		//aaa = 100; //<= 상수이기 떄문에 수정을 할수없다
		System.out.println("Hello world");
		
	}

	@Override
	public int add(int num) {
		// TODO Auto-generated method stub
		return num+num; //num X 2
	}
	
}