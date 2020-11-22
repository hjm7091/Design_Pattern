package duck_example.abstract_factory;

import duck_example.duck.DuckCall;
import duck_example.duck.MallardDuck;
import duck_example.duck.Quackable;
import duck_example.duck.RedheadDuck;
import duck_example.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
