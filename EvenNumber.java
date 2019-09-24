package PlayGround;

public class EvenNumber {
	private int number;
	
	public EvenNumber(int number) {
		
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void generateEven() {
		
		if((number % 2) != 0) {
			System.out.print(number);
		}
	else {
		
		for(int i = 2; i<= number; i+=2) {
			System.out.print(" " + i);
			}	
		
		}
		
	
	}
}


