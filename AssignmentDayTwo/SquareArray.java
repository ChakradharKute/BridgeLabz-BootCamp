package AssignmentDayTwo;

public class SquareArray {
	public static void main(String[] args) {
		int[] squares = new int[10];
		for (int i = 1; i <= 10; i++) {
			squares[i - 1] = i * i;
		}

		System.out.println("squares from 1 to 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " square: " + squares[i - 1]);
		}
	}
}
