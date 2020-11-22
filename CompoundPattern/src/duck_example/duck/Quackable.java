package duck_example.duck;

import duck_example.observer.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
