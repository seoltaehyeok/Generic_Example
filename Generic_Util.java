package Generic_method;

public class Generic_Util {
	//���׸� �޼ҵ� ����
	public static <T> Generic_Box1<T> boxing(T t){ //boxing �޼ҵ带 ȣ���� �� ��ü���� Ÿ��(�Ű�Ÿ�԰� ����Ÿ��)�� ����
		Generic_Box1<T> box = new Generic_Box1<T>();
		box.set(t);
		return box;
	}
}
