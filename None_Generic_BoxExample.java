package none_generic_type;

public class Generic_BoxExample {

	public static void main(String[] args) {
		Generic_Box box = new Generic_Box();
		
		box.set("홍길동"); // String 타입 홍길동이 자동타입변환이 됨
		
		Object obj = box.get(); //Object 타입으로 리턴되는데 자식타입인 String으로 받을 수 없음
		String name = (String) box.get(); // 자식타입으로 강제타입변환을 한 경우에는 사용가능
		
		box.set(new Generic_Apple()); //Apple이 상속받지않더라도 Object가 모든 자바객체의 상위 부모이므로 오류발생x
		Generic_Apple app = (Generic_Apple) box.get(); // Apple 객체를 찾아오려면 강제타입변환이 필요
		Object app2 = box.get();
		
		System.out.println(app2);
		System.out.println(app);
		System.out.println(obj);
		System.out.println(name);
	}
}
