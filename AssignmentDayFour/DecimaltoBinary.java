package AssignmentDayFour;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int decimalno = sc.nextInt();


		try {
			String binaryno = Integer.toBinaryString(decimalno);
			System.out.println("Binary :" + binaryno);
		} catch (Exception e) {
			System.out.println("Please enter non-negative decimal number");
		}
	}
}
