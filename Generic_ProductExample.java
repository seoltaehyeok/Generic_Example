package Generic_multy_type_parameter;

public class Generic_ProductExample {

	public static void main(String[] args) {
		//Generic_Product<Generic_Tv, String> product1 = new Generic_Product<Generic_Tv, String>();
		Generic_Product<Generic_Tv, String> product1 = new Generic_Product<>(); //위 코드와 동일
		product1.setKind(new Generic_Tv());
		product1.setModel("스마트 TV");
		Generic_Tv tv = product1.getKind();
		product1.getModel();
		String tvModel = product1.getModel();
		
		Generic_Product<Generic_Car, String> product2 = new Generic_Product<>();
		product2.setKind(new Generic_Car());
		product2.setModel("디젤");
		Generic_Car car = product2.getKind();
		String carModel = product2.getModel();
		
		/*Product에 다양한 타입이 들어올 수 있다. 즉 타입변환없이 저장되고 타입변환없이 리턴된다는 장점이 있다.*/
	}

}
