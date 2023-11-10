package AssignmentDayTwo;

import java.util.Random;

public class RandomArraySum {

	public static void main(String[] args) {
		int[] randomArray = new int[75];
		int sum = 0;

		Random random = new Random();

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = random.nextInt(101);
			sum += randomArray[i];
		}

		double average = (double) sum / randomArray.length;

		System.out.println("Random Array of 75 elements:");
		for (int i : randomArray) {
			System.out.print(i + " ");
		}

		System.out.println("\nSum of elements: " + sum);
		System.out.println("Average of elements: " + average);
	}
}
