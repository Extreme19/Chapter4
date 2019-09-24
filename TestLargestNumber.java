package PlayGround;
import java.util.Scanner;
public class TestLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LargestNumber check = new LargestNumber(0);
		
		int max = 0;
		int i = 0; 
		do {
			
			System.out.print("Enter number to test: \n");
			int number = input.nextInt();
			check.setNumber(number);
			if(check.getNumber() > max) {
				max = check.getNumber();
			
			}
			else {
				max = max;
			}
			i++;
		}
		while(i < 10);
		
		System.out.printf("Largest number is %d", max);	
			
			
			
		
	}

}
