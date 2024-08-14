package day12;
import java.util.*;


public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컬렉션 프레임 워크
		//LIST, SET, MAP
		//LIST
		/**
		 * 배열의 사용 편의를 위해만들어진 객체
		 * 동적 배열. ㅡ 메모리 크기가 변화 된다
		 * 변화라는 단어는 <삭제와 
		 * 
		 * Array보다 느릴 수 있다
		 * LinkedList와 ArrayList의 속도차이가 존재하므로
		 * 하나만 명목적으로 사용하는 것은 지양
		 */
		
		
		List<String> list;// = new LinkedList<String>();
		list = new ArrayList<String>();
		
		list.add("슈퍼맨");
		list.add("배트맨");
		
		//forEach
		for(String li : list) {
			System.out.println(li);
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		
		// ********** 중복 제거
		Set<String> set = new HashSet<String>();
		
		set.add("슈퍼맨");
		set.add("배트맨");
		set.add("슈퍼맨"); //하나는 입력이 안 된 것을 확일 할 수 있습니다.
		
		System.out.println(set.size());
		
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()) {
			String e = it2.next();
			System.out.println(e);
		}
		
		for(String li: set) {
			System.out.println(li);
		}
		
		//key와 value
		//set의 중복제거 기능을 합쳐서 만들어진 객체
		//key는 set의 중복 제거를 갖고 있습니다
		//데이터 가공을 목적 ( java 의해서 데이터를 가지고 올 때 )
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("num", "슈퍼맨");
		System.out.println(map.get("num"));
		
		Set<String> keyList = map.keySet();
		for(String key: keyList) {
			System.out.println("key :"+key);
			System.out.println("value :"+map.get(key));
		}
		
		//Exception
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		//Exception
		//프로그램 구동이 멈춥니다
		//개발자가 이미 인지하고 있는 에러를 처리 하는 것
		
//		while(true) {
//			try {
//				int num = sc.nextInt();
//				System.out.println("입력값 : "+num);
//			} catch (Exception e){
//				System.out.println("error");
//				break;
//			}
//		}
		
		//외부 라이브러리를 가져다 쓸 때, 그 때 발생 되는 exception
		//일반 에러 , 실행 에러( RunTime Exception )
		//실행 에러 코드 자체는 뭄ㄴ제가 없습니다
		//불러오는 과정에서 상황에 따라서 error가 발생
		
		String [] arr =new String[1];
		
		//try , catch, finally
		//try 예외 처리 하는 구간
		//catch는 try문에서 발생 된 error 가 처리 되는 곳
		//catch가 여러 개일 때 위에서부터 처리가 가능한 catch가 동작
		//catch가 동작이 되면 에러(동작 멈춤) => 경고(코드 잘못 되었다)
		//처리가 가능한 catch가 없을 때 error
		
		//finally는 반드시 실행 되어야 하는 것 생행 부분
		//try => catch => finlally
		//
		
		try {
			
			System.out.println(arr[0].equals(""));
			
			arr[1] = "슈퍼맨";
			//초기화 작업
			//JAVA는 가비지컬렉터가 존재
			//arr[0] = null;
		}
		//Excpetion 이라는 것을 지양. ( 모든 error 예외의 최상위 )
		//Object => Exeprion(모든 예외처리 담당)
		//개발자가 인지 한 범위 내에서만 사용 하는 것
		catch (NullPointerException e){
			System.out.println("Null Pointer Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		//반드시 구동되는 부분
		finally {
			//jdbc에서 많이 나옴
			try { } catch (Exception e){ }
			System.out.println("finally");
			arr[0] = null;
		}
		
		//에러를 잘 알아야 됩니다
		//코드를 잘 짜는 것은 default
		//디버그를 잘 하는 사람이 good (개발이 30% 디버그가 70% )
		System.out.println("---- 정상 종료");
	}

}
