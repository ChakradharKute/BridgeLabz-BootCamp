package DayThreeAssignment;

public class MaxElementsArray {
	public static void main(String[] args) {
		int[] a = { 10, 40, 20, 60, 10 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] >= max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
