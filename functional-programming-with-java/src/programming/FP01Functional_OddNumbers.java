package programming;

import java.util.List;

public class FP01Functional_OddNumbers {

	public static void main(String[] args) {

		printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	/*
	 * private static boolean isEven(int number) { return number % 2 == 0; }
	 */

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number-> number%2!=0).
		forEach(System.out::println);

	}

}
