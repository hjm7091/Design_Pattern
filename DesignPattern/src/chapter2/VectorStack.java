package chapter2;

import java.util.Vector;

public class VectorStack {
	private Vector<String> v = new Vector<String>();
	
	public void push(String element) {
		v.add(element);
	}
	
	public String pop() {
		return v.remove(v.size()-1);
	}
	
	public boolean isEmpty() {
		return v.isEmpty();
	}
	
	public int size() {
		return v.size();
	}
}
