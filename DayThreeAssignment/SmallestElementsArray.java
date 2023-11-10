package DayThreeAssignment;

public class SmallestElementsArray {
	public static void main(String[] args) {
		int a[] = { 60, 10, 20, 5, 3, 1 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		System.out.println(min);

	}
}
