package chapter2;

import java.util.ArrayList;

public class ArrayListStack {

	private ArrayList<Integer> items;
	private int stackSize;
	
	public ArrayListStack(int stackSize) {
		items = new ArrayList<Integer>(stackSize);
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public boolean isFull() {
		return (items.size() >= (this.stackSize));
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Inserting fail!");
		}
		else {
			items.add(new Integer(item));
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail!");
			return -1;
		}
		else {
			return items.remove(items.size()-1);
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail!");
			return -1;
		}
		else {
			return items.get(items.size()-1);
		}
	}
	
	public static void main(String[] args) {
		ArrayListStack st = new ArrayListStack(10);
		st.push(20);
		System.out.println(st.peek());
	}

}
