package PlayGround;
import java.util.Scanner;

public class TestCompare {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		Comparison check = new Comparison(num1, num2);
		check.setFirstNumber(num1);
		check.setSecondNumber(num2);
		System.out.print(check.compare(check.getFirstNumber(), check.getSecondNumber()));
		
	
		
		
		
		
		

	}

}
