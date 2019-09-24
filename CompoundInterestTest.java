package PlayGround;

import java.util.Scanner;

public class CompoundInterestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
		Scanner enter = new Scanner(System.in);
		CompoundInterest loan = new CompoundInterest(2,2);
		System.out.print("Enter amount: ");
		double amount = enter.nextDouble();
		System.out.print("Enter number of years: ");
		double years = enter.nextDouble();
		
		loan.setAmount(amount);
		loan.setYears(years);
		System.out.printf("The total amount to be paid after %.2f years is %.2f", loan.getYears(), loan.amountToBePaid());
	
	}

}
