package one.digitalinnovation.gof.singleton;

/**
 * Singleton "hasty".
 * 
 * @author njtsb1
 */
public class SingletonEager {

	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
