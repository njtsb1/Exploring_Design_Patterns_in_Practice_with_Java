package one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behavior {

	@Override
	public void tomove() {
		System.out.println("Moving aggressively...");
	}

}
