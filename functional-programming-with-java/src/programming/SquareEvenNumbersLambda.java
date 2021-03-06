package programming;

import java.util.List;

public class SquareEvenNumbersLambda {

	public static void main(String[] args) {

		printSquaresOfEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().
		filter(number -> number % 2 == 0)
		.map(number -> number * number)
		.forEach(System.out::println);

	}

}
