package PlayGround;

public class Comparison {

	private int firstNumber;
	private int secondNumber;
	
	
	public Comparison() {
		
	}
	public Comparison( int num1, int num2) {
		firstNumber = num1;
		secondNumber = num2;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int compare(int x, int y) {
		int max = 0;
		if(x > y) {
			max = x;
		}
		if (y > x) {
			max = y;
		}
		//if(x == y) {
			//System.out.print("Are equal");
			
		//}
		else {
			max = max;
		}
	return max;
	}
	
}


