package duck_example.abstract_factory;

import duck_example.decorator.QuackCounter;
import duck_example.duck.DuckCall;
import duck_example.duck.MallardDuck;
import duck_example.duck.Quackable;
import duck_example.duck.RedheadDuck;
import duck_example.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
