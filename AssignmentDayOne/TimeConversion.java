package AssignmentDayOne;

import java.util.Scanner;

/*Time conversion Develop a program which converts input seconds in hours and
minutes and seconds.
Eg. 7515 seconds = 2 Hours, 5 minutes and 15 seconds
*/
public class TimeConversion {
	public static void main(String[] args) {
		int seconds, hours, minutes, totalseconds;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Time Conversion from seconds to Hours");
		System.out.println("Enter time in seconds :");
		totalseconds= sc.nextInt();
		
				
		sc.close();

		
		
		hours = totalseconds / 3600;  
		totalseconds %= 3600;
        minutes = totalseconds / 60;  
        seconds = totalseconds % 60;
		
		
		System.out.println(totalseconds+ " seconds =" +  hours + " Hours," +  minutes + " minutes and " + seconds +" seconds");
		
		
	}

}
