package AssignmentDayTwo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Program for Leap Year");
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to find Leap Year or Not:");
		year = sc.nextInt();

		if (year >= 1582) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					{
				System.out.println("Leap Year");
			} else {
				System.out.println("Not an Leap Year");
			}
		} else {
			System.out.println("Year before Than 1582");
		}
	}
}
