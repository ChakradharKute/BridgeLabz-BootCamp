package DayThreeAssignment;

public class ArrayEvenPosition {
	public static void main(String[] args) {
		int[] a = { 2, 60, 3, 4, 5, 6, 7, 8 };

		for (int i = 1; i < a.length; i = i + 2) {
			System.out.println(a[i]);

		}

	}
}
