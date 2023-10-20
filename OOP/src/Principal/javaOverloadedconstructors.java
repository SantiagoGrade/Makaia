package Principal;

public class javaOverloadedconstructors {
	
	public static void main (String[] args) {
		
		Pizza pizza = new Pizza("thicc crust");
		
		System.out.println("Here're the ingredientes of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
