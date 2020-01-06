package code6_7;

public class Printer {
	
	private static Printer printer = new Printer();
	private int counter = 0;
	
	private Printer() {
		
	}
	
	public static Printer getPrinter() {
		return printer;
	}
	
	public void print(String str) {
		synchronized (this) {
			counter++;
			System.out.println(str+counter);
		}
	}
}
