package AssignmentDayOne;

import java.util.Random;

public class SumOfTwoDice {
	public static void main(String[] args) {

		Random random = new Random();

		int die1 = random.nextInt(6) + 1;
		int die2 = random.nextInt(6) + 1;

		int total = die1 + die2;

		System.out.println("The sum of two dice rolls is: " + total);
	}

}
