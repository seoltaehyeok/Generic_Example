package Generic_multy_type_parameter;

public class Generic_ProductExample {

	public static void main(String[] args) {
		//Generic_Product<Generic_Tv, String> product1 = new Generic_Product<Generic_Tv, String>();
		Generic_Product<Generic_Tv, String> product1 = new Generic_Product<>(); //�� �ڵ�� ����
		product1.setKind(new Generic_Tv());
		product1.setModel("����Ʈ TV");
		Generic_Tv tv = product1.getKind();
		product1.getModel();
		String tvModel = product1.getModel();
		
		Generic_Product<Generic_Car, String> product2 = new Generic_Product<>();
		product2.setKind(new Generic_Car());
		product2.setModel("����");
		Generic_Car car = product2.getKind();
		String carModel = product2.getModel();
		
		/*Product�� �پ��� Ÿ���� ���� �� �ִ�. �� Ÿ�Ժ�ȯ���� ����ǰ� Ÿ�Ժ�ȯ���� ���ϵȴٴ� ������ �ִ�.*/
	}

}
