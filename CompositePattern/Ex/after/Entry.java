package after;

public abstract class Entry {
	
	private String name;
	private int depth = 0;
	
	public Entry(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public abstract int getSize();
	public abstract void print();
}
