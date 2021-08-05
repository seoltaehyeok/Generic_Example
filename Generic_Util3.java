package Generic_bounded_type;

public class Generic_Util3 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); //v1>v2=true, v1<v2=false
	}
}
