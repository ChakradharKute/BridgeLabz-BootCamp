package DayThreeAssignment;

public class ArrayFrquency {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 2, 3, 1, 5, 6, 4, 7, 8, 7, 9 };

		for (int i = 0; i < array.length; i++) {
			int element = array[i];
			if (element != -1) {
				int frequency = 1;

				for (int j = i + 1; j < array.length; j++) {
					if (element == array[j]) {
						frequency++;
						array[j] = -1;
					}
				}

				System.out.println("Element " + element + " occurs " + frequency + " times.");
			}
		}
	}
}
