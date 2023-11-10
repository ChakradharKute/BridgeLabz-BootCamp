package AssignmentDayFive;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s= sc.next();
		String temp="";
		
		String[] rev= s.split(" ");
		for(int i=s.length()-1;i<=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println("Reverse of Sentence is" +temp);
	
	
	}
}
