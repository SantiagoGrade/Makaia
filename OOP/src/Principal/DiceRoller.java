package Principal;

import java.util.Random;

public class DiceRoller {
	
	Random random = new Random();
	int number = 0;
	
	DiceRoller(){ 
		
		roll(random,number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
