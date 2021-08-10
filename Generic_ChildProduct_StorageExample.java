package Generic_extends_implements;

public class Generic_ChildProduct_StorageExample {

	public static void main(String[] args) {
		Generic_extends_ChildProduct<Tv, String, String> product = new Generic_extends_ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		//인터페이스 = new 구현객체
		Generic_Storage<Tv> storage = new Generic_StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0); // 0인덱스에 저장되어 있는 Tv객체를 리턴되어서 tv로 넘김
		

	}

}
