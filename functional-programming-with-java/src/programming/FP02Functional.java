package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int sum = addListFunctional(numbers);
		System.out.println("Sum of Numbers present in the list are : " + sum);

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	private static int addListFunctional(List<Integer> numbers) {

		return numbers.stream().reduce(0, FP02Functional::sum);

	}

}
