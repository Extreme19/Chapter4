package PlayGround;
import java.util.Scanner;

public class TesstCreditLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		CreditLimit obj = new CreditLimit();
		double creditLimit = 20_000;
		System.out.print("Enter Account Number: ");
		double account = input.nextDouble();
		System.out.print("Enter Your balance at the beginning of the month: ");
		double bal = input.nextDouble();
		System.out.print("Enter your total items charge: ");
		double charge = input.nextDouble();
		System.out.print("Enter total credit to your account: ");
		double credit = input.nextDouble();
		obj.setAccountNumber(account);
		obj.setBeginningBal(bal);
		obj.setTotalCharge(charge);
		obj.setTotalCredit(credit);
		
		if(obj.calculateNewBal() >creditLimit) {
			System.out.printf("Credit limit exceeded and you owe %.2f", (obj.calculateNewBal() - creditLimit));
		}
		else {
			System.out.printf("Your account balance is %.2f", obj.calculateNewBal());
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
