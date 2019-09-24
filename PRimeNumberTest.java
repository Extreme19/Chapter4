package PlayGround;
import java.util.Scanner;

public class PRimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber(3);
		System.out.print("Enter number to test: \n");
		int num = input.nextInt();
		obj.setNumber(num);
	
//		if(obj.getNumber() % (Math.random() *9) != 0) 
		if(obj.getNumber() % 2 != 0 && obj.getNumber() % 3 != 0 || obj.getNumber()== 3) {
			
			if(obj.getNumber() % 5 != 0 && obj.getNumber() % 7 != 0 && obj.getNumber() % 9 != 0)
		
				System.out.print("Prime number");}
				else  
			System.out.print("Not a Prime number");
		
		
		
		
		
		
		
		
	}
	

}
