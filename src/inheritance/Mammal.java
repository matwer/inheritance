/**
 * 
 */
package inheritance;

/**
 * @author Matthew
 *
 */
public class Mammal {
	private boolean sleeping = false;
	
	public void regulateTemperature() {
		System.out.println("The temperature is just right now.");
	}
	
	public void startSleeping() {
		sleeping = true;
		System.out.println("Zzzzzzzzzzzzzzzzz");
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
}
