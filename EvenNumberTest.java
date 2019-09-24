package PlayGround;
import java.util.Scanner;
public class EvenNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OOP format
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = value.nextInt();
		EvenNumber check = new EvenNumber(number);
		check.setNumber(number);
		check.generateEven();
		
		
		
		//Monolithic format
//		System.out.print("Enter number: ");
//		int number = value.nextInt();
//		if((number % 2) != 0) {
//				System.out.print(number);
//			}
//		else {
//			
//			for(int i = 0; i<= number; i+=2) {
//				System.out.print(" " + i);
//			}	
//			
//			}
//			
		
	}

}
