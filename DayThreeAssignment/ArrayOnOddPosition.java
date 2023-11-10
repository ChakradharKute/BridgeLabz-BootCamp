package DayThreeAssignment;

public class ArrayOnOddPosition {
	public static void main(String[] args) {
		int [] arr= {10,40,30,20,60,29};
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}

}
