package Generic_method2;

public class Generic_Pair<K,V> {
	private K key;
	private V value;
	
	//持失切識情
	public Generic_Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}
