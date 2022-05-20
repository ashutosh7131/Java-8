package programming;

import java.util.List;

public class FP01Functional_OddNumbers_LamdaExpression2 {

	public static void main(String[] args) {

		printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(FP01Functional_OddNumbers_LamdaExpression2::isOdd).
		forEach(System.out::println);

	}

}
