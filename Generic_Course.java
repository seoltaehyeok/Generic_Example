package Generic_wildcard;

public class Generic_Course<T>{
	private String name; //과정 명
	private T[] students; //수강생
	
	public Generic_Course(String name, int capacity) { //이름과 학생 수
		this.name = name;
		//students = new T[capacity]; //T타입이 정해지지 않았는데 new를 사용하여 배열을 만들 수 없음
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() { return name;}
	public T[] getSetudents() { return students;}
	
	public void add(T t) {
		 for(int i=0; i<students.length; i++) {
			 if(students[i]== null) {
				 students[i] = t;
				 break;
			 }
		 }
	}
}

