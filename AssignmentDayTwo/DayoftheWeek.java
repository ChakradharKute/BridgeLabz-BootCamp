 package AssignmentDayTwo;

import java.util.Scanner;

/*Day of the Week Write a program that takes a number from 1 to 7 as input and
outputs the corresponding day of the week (e.g., 1 - Sunday, 2 - Monday, ...). */

public class DayoftheWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number from 1 to 7: ");
		int dayNumber = sc.nextInt();

		String dayOfWeek = getDayOfWeek(dayNumber);
		System.out.println("Day of the week: " + dayOfWeek);

		sc.close();
	}

	public static String getDayOfWeek(int dayNumber) {
	        String dayOfWeek;

	        switch (dayNumber) {
	            case 1:
	                dayOfWeek = "Sunday";
	                break;
	            case 2:
	                dayOfWeek = "Monday";
	                break;
	            case 3:
	                dayOfWeek = "Tuesday";
	                break;
	            case 4:
	                dayOfWeek = "Wednesday";
	                break;
	            case 5:
	                dayOfWeek = "Thursday";
	                break;
	            case 6:
	                dayOfWeek = "Friday";
	                break;
	            case 7:
	                dayOfWeek = "Saturday";
	                break;
	            default:
	                dayOfWeek = "Invalid input, Please enter a number from 1 to 7.";
	        }

	        return dayOfWeek;
	}

}
