package generic_type;

public class Generic_BoxExample {

	public static void main(String[] args) {
		Generic_Box<String> box = new Generic_Box<String>(); //������ <T>�� String���� ��� ����
		
		//box.set(new Integer(10)); //���׸�Ÿ���� �̹� String���� �־ �ٸ�Ÿ���� ���� �� ����
		box.set("hello");
		String greet = box.get(); // String greet = (String) box.get();�� �� �ʿ䰡 ����

		Generic_Box<Integer> box2 = new Generic_Box<Integer>(); //������ <T>�� Integer���� ��� ����
		box2.set(6);
		int value = box2.get(); // int value = (Integer) box2.get();�� �� �ʿ䰡 ����
	}
}
