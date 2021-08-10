package Generic_wildcard;

public class Generic_Course<T>{
	private String name; //���� ��
	private T[] students; //������
	
	public Generic_Course(String name, int capacity) { //�̸��� �л� ��
		this.name = name;
		//students = new T[capacity]; //TŸ���� �������� �ʾҴµ� new�� ����Ͽ� �迭�� ���� �� ����
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

