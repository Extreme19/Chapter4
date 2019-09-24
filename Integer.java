package PlayGround;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
//		for(int i = 1; i <= number; i++) {
//			if(i < number) {
//				i = number;
//			}
		
		int min = 0;
		for(int i = 1;i<= number; i++){
			if(i < number) {
			min = i;
			}
			if(number < i) {
				min = number;
			}
		}
		
		
		System.out.print(min);
		
		
		
		
	}

}
