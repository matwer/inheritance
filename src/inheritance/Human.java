/**
 * 
 */
package inheritance;

/**
 * @author Matthew
 *
 */
// Human inherits all the methods from Mammal through the extends keyword
public class Human extends Mammal {
	
	public void goToWork() {
		System.out.println("I'm going to work, something only humans have to do do.");
	}
	
	// overriding tje Mammal startSleeping() method
	public void startSleeping() {
		System.out.println("The human tosses and turns - must need a CPAP...");
		// using the Super keyword to override the subclass startSleeping method
		super.startSleeping();
	}

}
