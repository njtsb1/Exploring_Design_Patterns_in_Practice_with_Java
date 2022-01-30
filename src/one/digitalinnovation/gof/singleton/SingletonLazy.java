package one.digitalinnovation.gof.singleton;

/**
 * Singleton "lazy".
 * 
 * @author njtsb1
 */
public class SingletonLazy {

	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
