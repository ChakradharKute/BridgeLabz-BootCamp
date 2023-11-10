package AssignmentDayOne;

import java.util.Scanner;

/*Weight Conversion In some UK shops grocery items sold are weighed in pounds.
Plan developing a program which converts the item weight in KG.
Where 1 Pound = 453.592 gm
Test this with entering different input in pounds and print the weight in KG
 */
public class WeightConversion {

	public static void main(String[] args) {
		double kgWeight;
		double poundsWeight;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the weight in pounds: ");
		poundsWeight = sc.nextDouble();

		kgWeight = poundsWeight * 453.592 / 1000;
		System.out.println("Weight in kilograms: " + kgWeight + " kg");
	}

}
