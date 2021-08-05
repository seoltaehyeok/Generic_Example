package Generic_method2;

public class Generic_Util2 {
	//�� ���� pare��ü�� �޾Ƽ� K������ ��, V�� ���� ���Ͽ� �Ѵ� ���� ������ true�����ϴ� ���ʸ� �޼ҵ�
	public static <K,V> boolean compare(Generic_Pair<K,V> p1, Generic_Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare; //keyCompare=true, valueCompare=true �϶� true�� ����
	}
}
