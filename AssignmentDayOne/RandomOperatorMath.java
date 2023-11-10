package AssignmentDayOne;
import java.util.Random;

/*RandomOperatorMath Write a program that generates two random integers
between 1 and 10 and a random arithmetic operator (+, -, *, or /), then prints the
equation and the result of the operation.*/

public class RandomOperatorMath {

	public static void main(String[] args) {
		Random random = new Random();

		int operand1 = random.nextInt(10) + 1;
		int operand2 = random.nextInt(10) + 1;

		char operator;
		int operatorChoice = random.nextInt(4);
		switch (operatorChoice) {
		case 0:
			operator = '+';
			break;
		case 1:
			operator = '-';
			break;
		case 2:
			operator = '*';
			break;
		case 3:
			operator = '/';
			break;
		default:
			operator = '+'; 
		}

		double result = 0;
		switch (operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			if (operand2 != 0) {
				result = (double) operand1 / operand2;
			} else {
				System.out.println("Division by zero is not allowed.");
				System.exit(1);
			}
			break;
		}

		System.out.println("Equation: " + operand1 + " " + operator + " " + operand2);
		System.out.println("Result: " + result);
	}
}



