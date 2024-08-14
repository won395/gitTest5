package day04;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] scores = new int[3];
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		System.out.println(scores.length);
		
		//배열에 선언할떄알고 있는 값을 넣는다
		//이떄 삽입한 캣수만큼 배열의 길이가 할당
		int[] scores2 = {89, 90, 87};
		System.out.println(scores2.length);
		
		//배열에 저장된 닶을 sum에 합친다.
		int sum = 0;
		//length: scores(배열)의 길이
		for(int i = 0; i <scores2.length; i++) {
			sum += scores2[i];
		}
		System.out.println("print: "+sum);
		
		double avg = (double) sum / scores2.length;
		System.out.println("평균: "+avg);
	}

}
