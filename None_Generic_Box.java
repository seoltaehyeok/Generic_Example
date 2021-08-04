package none_generic_type;

public class Generic_Box {
	private Object object; // 다양한 객체가 타입변환되어서 저장될 수 있음
	public void set(Object object) { // object에는 모든 자바 객체가 대입가능
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
