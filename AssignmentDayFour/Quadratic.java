package AssignmentDayFour;

import java.util.Scanner;

public class Quadratic {

	public static double computeDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	public static double[] computeRoots(double a, double b, double delta) {
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		return new double[] { root1, root2 };
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = sc.nextDouble();

		double delta = computeDelta(a, b, c);

		if (delta < 0) {
			System.out.println("The equation has complex roots.");
		} else {
			double[] roots = computeRoots(a, b, delta);
			System.out.println("The roots of the quadratic equation are: " + roots[0] + " and " + roots[1]);
		}
	}
}
