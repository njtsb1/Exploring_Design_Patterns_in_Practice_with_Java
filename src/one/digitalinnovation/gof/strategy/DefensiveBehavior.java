package one.digitalinnovation.gof.strategy;

public class DefensiveBehavior implements Behavior {

	@Override
	public void tomove() {
		System.out.println("Moving defensively...");
	}

}
