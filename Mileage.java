package PlayGround;
import java.util.Scanner;

public class Mileage {
 private double miles;
 private double gallons;
 
 
 public Mileage (double miles, double gallons) {
	 this.miles = miles;
	 this.gallons = gallons;
 }
 
 
 public double getMiles() {
	return miles;
}

public void setMiles(double miles) {
	this.miles = miles;
}

public double getGallons() {
	return gallons;
}

public void setGallons(double gallons) {
	this.gallons = gallons;
}


public void calculateConsumption() {
	Scanner input = new Scanner(System.in);
	float total = 0;
	float consumed = (float) (miles / gallons);


	while (miles != -1 && gallons != -1 ) {
		
		System.out.print("Enter miles covered or enter -1 to stop: ");
		miles = input.nextDouble();
			if(miles != -1) {
				System.out.print("Enter galons used or enter -1 to stop: ");
				gallons = input.nextDouble();
				consumed = (float)(miles / gallons);
		
				System.out.println(consumed);
			}
		total = total +consumed;
		
	}
	if(miles == -1 || gallons == -1) {
	System.out.println("Session Terminated");
	System.out.printf("%.2f", total);}
		
}

}
