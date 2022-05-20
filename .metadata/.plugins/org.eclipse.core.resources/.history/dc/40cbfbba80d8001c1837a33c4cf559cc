package programming;

import java.util.List;

public class Courses_FunctionalProgramming {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes", "Angular With Spring FullStack Development", "React in Action With Spring Boot");
		courses.stream().forEach(System.out::println);
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		courses.stream().filter(courseNameLength -> courseNameLength.length() >= 4).forEach(System.out::println);

	}

}
