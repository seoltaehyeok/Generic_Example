package Generic_wildcard;

public class Generic_Person {
	private String name;
	
	public Generic_Person(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	@Override
	public String toString() {
		return name;
	}
}
