package programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Using_Stream {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "ashutosh", "shriansh", 1000);
		Employee emp2 = new Employee(70, "Shanu", "sadhayn", 2000);
		Employee emp3 = new Employee(100, "Ankit", "Verma", 500);
		Employee emp4 = new Employee(200, "Shubham", "sri", 5000);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("Number of elements present in the list are : " + empList.stream().count());

		List<Employee> sortedList = empList.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());

		sortedList.forEach(System.out::println);

	}

}
