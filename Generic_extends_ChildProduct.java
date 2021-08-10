package Generic_extends_implements;

//main¿« K: Tv / V: String / C: String
public class Generic_extends_ChildProduct<K, V, C> extends Generic_extends_Product<K, V>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
