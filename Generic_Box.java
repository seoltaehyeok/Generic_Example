package generic_type;

public class Generic_Box <T>{
	private T t; // �پ��� ��ü�� Ÿ�Ժ�ȯ�Ǿ ����� �� ����

	public void set(T t) { // object���� ��� �ڹ� ��ü�� ���԰���
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
