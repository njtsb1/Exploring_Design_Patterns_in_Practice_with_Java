package one.digitalinnovation.gof.strategy;

public class Robot {
	
	private Behavior behavior;

	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void tomove() {
		behavior.tomove();
	}
}
