package generic_type;

public class Generic_Box <T>{
	private T t; // 다양한 객체가 타입변환되어서 저장될 수 있음

	public void set(T t) { // object에는 모든 자바 객체가 대입가능
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
