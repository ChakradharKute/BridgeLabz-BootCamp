package DayThreeAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAscending {
	public static void main(String[] args) {
		int [] arr= {1,4,3,9,2};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
