package Generic_extends_implements;

public interface Generic_Storage<T> {
	public void add(T item, int index); // item에 들어오는 T 객체를 index에 저장
	public T get(int index); // index에 저장되어 있는 객체를 찾아서 T에게 리턴
}
