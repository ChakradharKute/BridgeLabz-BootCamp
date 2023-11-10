package AssignmentDayOne;

import java.util.Scanner;

public class PrintOrderDetails {
	public static void main(String[] args) {
		int orderId;
		String itemName;
		int quantity;
		double totalCost;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter orderId:");
		orderId= sc.nextInt();
		System.out.println("Enter itemName:");
		itemName= sc.next();
		System.out.println("Enter quantity:");
		quantity= sc.nextInt();
		System.out.println("Enter totalCost:");
		totalCost= sc.nextDouble();
		System.out.println( "["+ quantity + "] of [" + itemName+ "] for a total of Rs [" + totalCost+ "].");
		
		
		
		
	}

}
