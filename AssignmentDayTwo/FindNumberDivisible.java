package AssignmentDayTwo;

public class FindNumberDivisible {
	public static void main(String[] args) {
		int no = 30; 
		int[] arr = new int[no];
		int count = 0;

		for (int i = 1; i <= no; i++) {
			if (i % 3 == 0) {
				arr[count] = i;
				count++;
			}
		}

		int[] divisibleBy3 = new int[count];
		System.arraycopy(arr, 0, divisibleBy3, 0, count);

		System.out.println("Numbers between 1 and 30 divisible by 3:");
		for (int num : divisibleBy3) {
			System.out.println(num);
		}
	}
}
