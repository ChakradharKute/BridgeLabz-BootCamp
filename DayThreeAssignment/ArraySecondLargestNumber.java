package DayThreeAssignment;

public class ArraySecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 50, 20, 70, 30, 10 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}

		System.out.println(temp);
	}

}
