package none_generic_type;

public class Generic_BoxExample {

	public static void main(String[] args) {
		Generic_Box box = new Generic_Box();
		
		box.set("ȫ�浿"); // String Ÿ�� ȫ�浿�� �ڵ�Ÿ�Ժ�ȯ�� ��
		
		Object obj = box.get(); //Object Ÿ������ ���ϵǴµ� �ڽ�Ÿ���� String���� ���� �� ����
		String name = (String) box.get(); // �ڽ�Ÿ������ ����Ÿ�Ժ�ȯ�� �� ��쿡�� ��밡��
		
		box.set(new Generic_Apple()); //Apple�� ��ӹ����ʴ��� Object�� ��� �ڹٰ�ü�� ���� �θ��̹Ƿ� �����߻�x
		Generic_Apple app = (Generic_Apple) box.get(); // Apple ��ü�� ã�ƿ����� ����Ÿ�Ժ�ȯ�� �ʿ�
		Object app2 = box.get();
		
		System.out.println(app2);
		System.out.println(app);
		System.out.println(obj);
		System.out.println(name);
	}
}
