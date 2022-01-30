package one.digitalinnovation.gof.strategy;

public class NormalBehavior implements Behavior {

	@Override
	public void tomove() {
		System.out.println("Moving normally...");
	}

}
