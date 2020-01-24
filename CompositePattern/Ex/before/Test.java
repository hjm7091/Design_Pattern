package before;

public class Test {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory dir1 = new Directory("Dir1");
		
		File f1 = new File("f1", 100);
		File f2 = new File("f2", 200);
		File f3 = new File("f3", 300);
		File f4 = new File("f4", 400);
		
		root.addEntry(f1);
		root.addEntry(dir1);
		dir1.addEntry(f2);
		dir1.addEntry(f3);
		dir1.addEntry(f4);
		
		dir1.print();
	}
	
}
