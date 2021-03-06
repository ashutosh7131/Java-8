package programming;

import java.util.List;

public class FP01Structured_OddNumbers {

	public static void main(String[] args) {

		printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		printOddNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		for (int number : numbers) {
			System.out.println("Printing Numbers in Sequence: " + number);
		}

	}

	private static void printOddNumbersInListStructured(List<Integer> numbers) {

		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.println("Printing Odd Numbers in Sequence: " + number);
			}
		}

	}

}
