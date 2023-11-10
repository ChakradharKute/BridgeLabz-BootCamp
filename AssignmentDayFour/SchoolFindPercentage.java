package AssignmentDayFour;
import java.util.Arrays;
import java.util.Random;

public class SchoolFindPercentage {

	public static void main(String[] args) {
		int totalStudents = 435;
		double[] marks = generateRandomMarks(totalStudents);

		double passPercentage = calculatePercentage(marks, 45.0, 100.0);
		double firstDivisionPercentage = calculatePercentage(marks, 60.0, 100.0);
		int ninetyAndAboveCount = countStudentsAboveThreshold(marks, 90.0);

		double averageFirstDivisionMarks = calculateAverage(marks, 60.0, 100.0);
		double averageSecondDivisionMarks = calculateAverage(marks, 45.0, 60.0);

		System.out.println("Pass Percentage: " + passPercentage + "%");
		System.out.println("First Division Percentage: " + firstDivisionPercentage + "%");
		System.out.println("Number of students scoring 90% and above: " + ninetyAndAboveCount);
		System.out.println("Average Marks of First Division Students: " + averageFirstDivisionMarks);
		System.out.println("Average Marks of Second Division Students: " + averageSecondDivisionMarks);
	}

	private static double[] generateRandomMarks(int totalStudents) {
		Random random = new Random();
		return random.doubles(totalStudents, 1.0, 100.0).toArray();
	}

	private static double calculatePercentage(double[] marks, double lowerBound, double upperBound) {
		long count = Arrays.stream(marks).filter(mark -> mark >= lowerBound && mark < upperBound).count();
		return (count / (double) marks.length) * 100;
	}

	private static int countStudentsAboveThreshold(double[] marks, double threshold) {
		return (int) Arrays.stream(marks).filter(mark -> mark >= threshold).count();
	}

	private static double calculateAverage(double[] marks, double lowerBound, double upperBound) {
		return Arrays.stream(marks)
				.filter(mark -> mark >= lowerBound && mark < upperBound)
				.average()
				.orElse(0.0);
	}
}



