package Generic_wildcard;

public class Generic_WildCardExample {
	public static void registerCourse(Generic_Course<?> course) {
			
	}
	
	public static void registerCourseStudent(Generic_Course<? extends Generic_Student> course) {
		
	}
	
	public static void main(String[] args) {
		
		registerCourse(new Generic_Course<Generic_Person>("�Ϲ��� ����",5));
		registerCourse(new Generic_Course<Generic_Student>("�л� ����",5));
		registerCourse(new Generic_Course<Generic_Worker>("�ٷ��� ����",5));
		registerCourse(new Generic_Course<Generic_highStudent>("����л� ����",5));
		
		registerCourseStudent(new Generic_Course<Generic_Person>("�Ϲ��� ����",5));
		registerCourseStudent(new Generic_Course<Generic_Student>("�л� ����",5));
		registerCourseStudent(new Generic_Course<Generic_Worker>("�ٷ��� ����",5));
		registerCourseStudent(new Generic_Course<Generic_highStudent>("����л� ����",5));
	}
}
