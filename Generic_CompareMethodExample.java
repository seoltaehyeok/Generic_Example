package Generic_method2;

public class Generic_CompareMethodExample {

	public static void main(String[] args) {
		/*���׸� Ÿ���� Integer, String���� �ֱ�*/
		Generic_Pair<Integer, String> p1 = new Generic_Pair<>(1, "���");
		Generic_Pair<Integer, String> p2 = new Generic_Pair<>(1, "���");
		
		//Generic_Util2.<Integer, String>compare(p1,p2);
		boolean result1 = Generic_Util2.compare(p1,p2);
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		
		/*���׸� Ÿ���� String, String���� �ֱ�*/
		Generic_Pair<String, String> p3 = new Generic_Pair<>("user1", "ȫ�浿");
		Generic_Pair<String, String> p4 = new Generic_Pair<>("user2", "ȫ�浿");
		
		//Generic_Util2.<Integer, String>compare(p1,p2);
		boolean result2 = Generic_Util2.compare(p3,p4);
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}
}
