package Generic_method;

public class Generic_BoxingMethodExample {

	public static void main(String[] args) {
		//Generic_Box1<Integer> box = Generic_Util.<Integer>boxing(100);
		Generic_Box1<Integer> box = Generic_Util.boxing(100); // �� �ڵ�� ����
		int value = box.get();
		System.out.println(value);
		
		Generic_Box1<String> box2 = Generic_Util.boxing("ȫ�浿"); // StringŸ������ ����
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
