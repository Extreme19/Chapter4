package PlayGround;

import java.util.Scanner;

public class CompoundInterest {
	private double amount;
	private double years;
	
	public CompoundInterest(double amount, double years) {
		
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	public double amountToBePaid() {
		
		double r = 0.05;
			
			for(int i = 1; i<= getYears(); i++ ) {
			 amount = 	amount * (1+ r);
					
			}
			  return amount;
	
	}

}
