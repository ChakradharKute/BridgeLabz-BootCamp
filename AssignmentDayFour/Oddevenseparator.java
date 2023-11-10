package AssignmentDayFour;

import java.util.Arrays;

public class Oddevenseparator {

	public static void main(String[] args) {
		int[] fibonacciSeries = generateFibonacciSeries(20);
		int[] oddNumbers = getNumbersArray(fibonacciSeries, true);
		int[] evenNumbers = getNumbersArray(fibonacciSeries, false);


		System.out.println(Arrays.toString(oddNumbers) + "is Odd numbers");
		System.out.println(Arrays.toString(evenNumbers) + "is Even numbers");

		String result = (oddNumbers.length > evenNumbers.length) ? "Odd numbers are more."
				: (evenNumbers.length > oddNumbers.length) ? "Even numbers are more."
						: "Odd and even numbers are equal in count.";
		System.out.println(result);
	}

	private static int[] generateFibonacciSeries(int n) {
		int[] fibonacciSeries = new int[n];
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;
		for (int i = 2; i < n; i++) {
			fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
		}
		return fibonacciSeries;
	}

	private static int[] getNumbersArray(int[] inputArray, boolean isOdd) {
		return Arrays.stream(inputArray).filter(number -> (isOdd && isOdd(number)) || (!isOdd && !isOdd(number)))
				.toArray();
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
