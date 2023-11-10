package AssignmentDayTwo;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Program for EvenOdd");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number= sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		
		
	}

}
