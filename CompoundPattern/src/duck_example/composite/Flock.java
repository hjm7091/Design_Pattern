package duck_example.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import duck_example.duck.Quackable;
import duck_example.observer.Observable;
import duck_example.observer.Observer;

public class Flock implements Quackable {

	Observable observable;
	List<Quackable> quackers = new ArrayList<>();
	
	public Flock() {
		observable = new Observable(this);
	}

	public void add(Quackable quacker) {
		this.quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Flock";
	}

}
