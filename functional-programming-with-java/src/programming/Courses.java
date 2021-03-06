package programming;

import java.util.List;

public class Courses {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes","Angular With Spring FullStack Development", "React in Action With Spring Boot");
		for(String course:courses) {
			System.out.println("Printing Courses in Old Fashion: " + course);
		}
		
		for(String courseName:courses) {
			if(courseName.contains("Spring")) {
				System.out.println("Printing Course Name in Old Fashion which contains Name as Spring :" + courseName);
			}
		}
		
		for(String courseNameLength:courses) {
			if(courseNameLength.length()>=4) {
				System.out.println("Printing Course Name in Old Fashion which contains Name with atleast 4 letters :" + courseNameLength);
			}
		}

	}

}
