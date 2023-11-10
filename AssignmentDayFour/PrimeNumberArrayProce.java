package AssignmentDayFour;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberArrayProce {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        System.out.print("Enter the lower limit: ");
	        int lowerLimit = sc.nextInt();

	        System.out.print("Enter the upper limit: ");
	        int upperLimit = sc.nextInt();

	        int[] randomArray = generateRandomArray(size, lowerLimit, upperLimit);

	        int[] nonPrimeArray = filterNonPrimeNumbers(randomArray);

	        System.out.println("Original Random Array: " + Arrays.toString(randomArray));
	        System.out.println("Non-Prime Array: " + Arrays.toString(nonPrimeArray));
	        System.out.println("Number of Prime Numbers: " + countPrimeNumbers(randomArray));
	    }

	    private static int[] generateRandomArray(int size, int lowerLimit, int upperLimit) {
	        Random random = new Random();
	        return random.ints(size, lowerLimit, upperLimit + 1).toArray();
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    private static int[] filterNonPrimeNumbers(int[] array) {
	        return Arrays.stream(array).filter(number -> !isPrime(number)).toArray();
	    }

	    private static int countPrimeNumbers(int[] array) {
	        return (int) Arrays.stream(array).filter(PrimeNumberArrayProce::isPrime).count();
	    }
	}



