package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.AggressiveBehavior;
import one.digitalinnovation.gof.strategy.DefensiveBehavior;
import one.digitalinnovation.gof.strategy.NormalBehavior;
import one.digitalinnovation.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		Behavior agressive = new AggressiveBehavior();
		
		Robot robo = new Robot();
		robo.setBehavior(normal);
		robo.tomove();
		robo.tomove();
		robo.setBehavior(defensive);
		robo.tomove();
		robo.setBehavior(agressive);
		robo.tomove();
		robo.tomove();
		robo.tomove();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrateClient("Nivaldo", "11850000");
	}

}
