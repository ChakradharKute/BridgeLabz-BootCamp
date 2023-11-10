package AssignmentDayOne;

import java.util.Scanner;

/*ComputeMarks Write a program which takes the student name, Physics,
Chemistry and Mathematics Marks of a student as input. For each subject, marks
are out of 100. Compute the total marks of that student, percentage in each
subject and total percentage.
Print the out as “[Student Name] obtained following % of marks in PCM:
Physics: [% in Physics ], Chemistry : [% in Chem], Maths : [% in Maths]
Total : [Total %]”
 */
public class ComputeMarks {
	public static void main(String[] args) {

		String studentName;
		int physicsMark, chemistryMark, mathematicsMark;
		float physicsPercentage, chemistryPercentage, mathematicsPercentage, totalPercentage;
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		studentName= sc.next();
		
		System.out.println("Enter physics Marks:");
		physicsMark = sc.nextInt();
		
		System.out.println("Enter Chemistry Marks:");
		chemistryMark = sc.nextInt();
		
		System.out.println("Enter Mathematics Marks:");
		mathematicsMark = sc.nextInt();
		
		physicsPercentage= (physicsMark*100)/100 ;
		chemistryPercentage= (chemistryMark*100)/100;
		mathematicsPercentage=(mathematicsMark*100)/100;
		totalPercentage= (physicsPercentage+chemistryPercentage+mathematicsPercentage)/3;
		
		System.out.println("["+studentName+ "] obtained following % of marks in PCM:\r\n"
				+ "Physics: [" + physicsPercentage + "%], Chemistry : [" + chemistryPercentage+ "%], Maths : ["+ mathematicsPercentage+ "%]\r\n"
				+ "Total : [" +totalPercentage +"%]");
		
		
		
		
		

	}

}
