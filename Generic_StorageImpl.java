package Generic_extends_implements;

public class Generic_StorageImpl<T> implements Generic_Storage<T>{ //�������̽��� ���׸��̸� ����Ŭ������ ���׸��̾�� ��

	//�������̽��� ������ �ִ� �߻�޼ҵ带 ������
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
