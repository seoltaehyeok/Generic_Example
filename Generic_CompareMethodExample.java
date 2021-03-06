package Generic_method2;

public class Generic_CompareMethodExample {

	public static void main(String[] args) {
		/*제네릭 타입을 Integer, String으로 주기*/
		Generic_Pair<Integer, String> p1 = new Generic_Pair<>(1, "사과");
		Generic_Pair<Integer, String> p2 = new Generic_Pair<>(1, "사과");
		
		//Generic_Util2.<Integer, String>compare(p1,p2);
		boolean result1 = Generic_Util2.compare(p1,p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		/*제네릭 타입을 String, String으로 주기*/
		Generic_Pair<String, String> p3 = new Generic_Pair<>("user1", "홍길동");
		Generic_Pair<String, String> p4 = new Generic_Pair<>("user2", "홍길동");
		
		//Generic_Util2.<Integer, String>compare(p1,p2);
		boolean result2 = Generic_Util2.compare(p3,p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
