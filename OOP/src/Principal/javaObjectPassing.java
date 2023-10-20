package Principal;

public class javaObjectPassing {
	
	public static void main (String[] args) {
		
		Garage garage = new Garage();
		
		Car2 car2 = new Car2("BMW");
		Car2 car = new Car2("Tesla");
		
		garage.park(car2);
		garage.park(car);
		
	}

}
