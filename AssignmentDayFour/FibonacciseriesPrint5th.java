package AssignmentDayFour;

import java.util.Scanner;

public class FibonacciseriesPrint5th {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Fibonacci series: ");

		try {
			int size = sc.nextInt();

			int[] fibonacciSeries = generateFibonacciSeries(size);

			printSeriesInLines(fibonacciSeries);
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
	}

	private static int[] generateFibonacciSeries(int size) {
		int[] fibonacciSeries = new int[size];
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;

		for (int i = 2; i < size; i++) {
			fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
		}

		return fibonacciSeries;
	}

	private static void printSeriesInLines(int[] series) {
		for (int i = 0; i < series.length; i++) {
			System.out.print(series[i] + ", ");

			if ((i + 1) % 5 == 0 || i == series.length - 1) {
				System.out.println();
			}
		}
	}
}
