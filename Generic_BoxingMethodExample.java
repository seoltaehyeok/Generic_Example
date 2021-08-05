package Generic_method;

public class Generic_BoxingMethodExample {

	public static void main(String[] args) {
		//Generic_Box1<Integer> box = Generic_Util.<Integer>boxing(100);
		Generic_Box1<Integer> box = Generic_Util.boxing(100); // 위 코드와 동일
		int value = box.get();
		System.out.println(value);
		
		Generic_Box1<String> box2 = Generic_Util.boxing("홍길동"); // String타입으로 유추
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
