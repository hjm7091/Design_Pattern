package after;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

	private List<Entry> entries = new ArrayList<Entry>();
	
	public Directory(String name) {
		super(name);
	}
	
	public void addEntry(Entry entry) {
		entries.add(entry);
		entry.setDepth(getDepth() + 1);
	}
	
	public void removeEntry(Entry entry) {
		entries.remove(entry);
	}
	
	public int getSize() {
		int size = 0;
		for(Entry entry : entries) {
			size += entry.getSize();
		}
		return size;
	}
	
	public void print() {
		for(int i=0; i<getDepth(); i++)
			System.out.print("\t");
		System.out.println("[Directory] " + getName() + ", Size: " + getSize());
		for(Entry entry : entries) {
			entry.print();
		}
	}
}
