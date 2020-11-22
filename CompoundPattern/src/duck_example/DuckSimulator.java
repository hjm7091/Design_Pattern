package duck_example;

import duck_example.abstract_factory.AbstractDuckFactory;
import duck_example.abstract_factory.CountingDuckFactory;
import duck_example.adapter.Goose;
import duck_example.adapter.GooseAdapter;
import duck_example.composite.Flock;
import duck_example.decorator.QuackCounter;
import duck_example.duck.Quackable;
import duck_example.observer.Quackologist;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With adapter, decorator, abstract factory, composite, observer");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	private void simulate(Quackable duck) {
		duck.quack();
	}
	
}
