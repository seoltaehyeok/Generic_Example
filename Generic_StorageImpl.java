package Generic_extends_implements;

public class Generic_StorageImpl<T> implements Generic_Storage<T>{ //인터페이스가 제네릭이면 구현클래스도 제네릭이어야 함

	//인터페이스가 가지고 있는 추상메소드를 재정의
	private T[] array;
	
	public Generic_StorageImpl(int capacity) {
		array = (T[]) (new Object[capacity]);
	}
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}
