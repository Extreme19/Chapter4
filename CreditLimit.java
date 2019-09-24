package PlayGround;

public class CreditLimit {
	private double accountNumber;
	private double beginningBal;
	private double totalCharge;
	private double totalCredit;
	
	public CreditLimit() {
		
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBeginningBal() {
		return beginningBal;
	}

	public void setBeginningBal(double beginningBal) {
		this.beginningBal = beginningBal;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	public double calculateNewBal() {
		double newBal = 0;
		newBal = (getBeginningBal() + getTotalCharge()) - getTotalCredit();
		return newBal;
		
	}
}
