package Generic_wildcard;

public class Generic_WildCardExample {
	public static void registerCourse(Generic_Course<?> course) {
			
	}
	
	public static void registerCourseStudent(Generic_Course<? extends Generic_Student> course) {
		
	}
	
	public static void main(String[] args) {
		
		registerCourse(new Generic_Course<Generic_Person>("일반인 과정",5));
		registerCourse(new Generic_Course<Generic_Student>("학생 과정",5));
		registerCourse(new Generic_Course<Generic_Worker>("근로자 과정",5));
		registerCourse(new Generic_Course<Generic_highStudent>("고등학생 과정",5));
		
		registerCourseStudent(new Generic_Course<Generic_Person>("일반인 과정",5));
		registerCourseStudent(new Generic_Course<Generic_Student>("학생 과정",5));
		registerCourseStudent(new Generic_Course<Generic_Worker>("근로자 과정",5));
		registerCourseStudent(new Generic_Course<Generic_highStudent>("고등학생 과정",5));
	}
}
