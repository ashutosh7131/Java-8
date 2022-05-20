package programming;

import java.util.List;

public class FP01Functional_EvenNumbers {

	public static void main(String[] args) {

		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(FP01Functional_EvenNumbers::isEven).
		forEach(System.out::println);

	}

}
