package Principal;

public class Car {
	
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2022;
	String color = "Red";
	double price = 50000.00;
	
	void drive () {
		System.out.println("You drive the car");
	}
	void brake () {
		System.out.println("You step on the break");
	}
	
	public String toString() {
		
		String myString = make +"\n"+model+"\n"+year+"\n"+color+"\n"+price;
		return myString;
	}

}
