package PlayGround;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		System.out.print("Enter first operand: ");
		double operand1 = enter.nextDouble();
		System.out.print("Enter operator: ");
		char operator = enter.next().charAt(0);
		System.out.print("Enter Second operand: ");
		double operand2 = enter.nextDouble();
		
		double addition = operand1 + operand2;
		double subtraction = operand1 - operand2;
		double multiplication = operand1 * operand2;
		double division = operand1 / operand2;
		
		switch (operator) {
		case '+':
			System.out.printf("The addition of both results in:  %d", addition);
			break;
		case '-':
			System.out.printf("The subtraction between both operands results in:  %d", subtraction);
			break;
		case '*':
			System.out.printf("The multiplication of both results in:  %.2f", multiplication);
			break;
		case '/':
			System.out.printf("The division of both results in: %.2f", division);
			break;
			default:
				System.out.printf("The operation is invalid");
		
		
		
		
		}
		
		
		
		
		
		
	}

}
