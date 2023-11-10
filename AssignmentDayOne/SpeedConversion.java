package AssignmentDayOne;

import java.util.Scanner;

/*Speed Conversion Create a program that converts speed given in kilometers per
hour (km/h) to meters per second (m/s) or vice versa.
Use the conversion factor: m/s = km/h * 1000 / 3600*/
public class SpeedConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Choose conversion direction (1 for km/h to m/s, 2 for m/s to km/h): ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.print("Enter speed in kilometers per hour (km/h): ");
			double speedKmh = scanner.nextDouble();
			double speedMs = kmhToMs(speedKmh);
			System.out.println(speedKmh + " km/h is equal to " + speedMs + " m/s");
		} else if (choice == 2) {
			System.out.print("Enter speed in meters per second (m/s): ");
			double speedMs = scanner.nextDouble();
			double speedKmh = msToKmh(speedMs);
			System.out.println(speedMs + " m/s is equal to " + speedKmh + " km/h");
		} else {
			System.out.println("Invalid choice. Please enter 1 for km/h to m/s or 2 for m/s to km/h.");
		}

		scanner.close();
	}

	public static double kmhToMs(double speedKmh) {
		double conversionFactor = 1000.0 / 3600.0;
		return speedKmh * conversionFactor;
	}

	public static double msToKmh(double speedMs) {
		double conversionFactor = 3600.0 / 1000.0;
		return speedMs * conversionFactor;
	}
}
