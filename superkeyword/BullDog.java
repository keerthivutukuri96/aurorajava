package superkeyword;

public class BullDog extends Dog  {

	public BullDog() {
		
		System.out.println("BullDog Constructor");
	}
	
	public void sound() {
		super.sound();
		System.out.println("BullDog sound");
	}
	
	public void food() {
		
		System.out.println("meat");
	}
}
