package generic_type;

public class Generic_BoxExample {

	public static void main(String[] args) {
		Generic_Box<String> box = new Generic_Box<String>(); //본문의 <T>는 String으로 모두 변경
		
		//box.set(new Integer(10)); //제네릭타입을 이미 String으로 주어서 다른타입이 들어올 수 없음
		box.set("hello");
		String greet = box.get(); // String greet = (String) box.get();을 할 필요가 없음

		Generic_Box<Integer> box2 = new Generic_Box<Integer>(); //본문의 <T>는 Integer으로 모두 변경
		box2.set(6);
		int value = box2.get(); // int value = (Integer) box2.get();을 할 필요가 없음
	}
}
