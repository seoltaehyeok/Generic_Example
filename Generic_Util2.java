package Generic_method2;

public class Generic_Util2 {
	//두 개의 pare객체를 받아서 K값끼리 비교, V값 끼리 비교하여 둘다 값이 같으면 true리턴하는 제너릭 메소드
	public static <K,V> boolean compare(Generic_Pair<K,V> p1, Generic_Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare; //keyCompare=true, valueCompare=true 일때 true를 리턴
	}
}
