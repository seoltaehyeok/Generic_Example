package Generic_extends_implements;

public class Generic_ChildProduct_StorageExample {

	public static void main(String[] args) {
		Generic_extends_ChildProduct<Tv, String, String> product = new Generic_extends_ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		//�������̽� = new ������ü
		Generic_Storage<Tv> storage = new Generic_StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0); // 0�ε����� ����Ǿ� �ִ� Tv��ü�� ���ϵǾ tv�� �ѱ�
		

	}

}
