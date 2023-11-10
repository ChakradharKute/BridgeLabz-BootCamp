package AssignmentDayTwo;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the score: ");
		double score = sc.nextDouble();
		char grade = convertToGrade(score);

		System.out.println("The student's letter grade is: " + grade);
	}

	public static char convertToGrade(double score) {
		char grade;

		if (score < 0 || score > 100) {
			grade = 'X';
		} else {
			int scoreRange = (int) (score / 10);
			switch (scoreRange) {
			case 9:case 10:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
		}

		return grade;
	}

}
