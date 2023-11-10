package AssignmentDayTwo;

import java.util.Scanner;

public class NumberTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to generate its table: ");
		int number = scanner.nextInt();

		System.out.println("Table for " + number + ":");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " X " + i + " = " + result);
		}
	}

}
