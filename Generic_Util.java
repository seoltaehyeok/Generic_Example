package Generic_method;

public class Generic_Util {
	//제네릭 메소드 선언
	public static <T> Generic_Box1<T> boxing(T t){ //boxing 메소드를 호출할 때 구체적인 타입(매개타입과 리턴타입)을 결정
		Generic_Box1<T> box = new Generic_Box1<T>();
		box.set(t);
		return box;
	}
}
