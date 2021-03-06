package programming;

import java.util.List;

public class CubeOddNumbersLambda {

	public static void main(String[] args) {

		printCubeOfOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().
		filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);

	}

}
