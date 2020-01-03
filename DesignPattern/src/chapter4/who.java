package chapter4;

public class who {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.doA1();
	}

}

class A1 {
	
	public void doA1() {
		A2 a2 = new A2();
		a2.doA2(this);
	}
	
	public void doIt(A3 a3) {
		a3.doIt();
	}
	
}

class A2 {
	
	public void doA2(A1 a1) {
		A3 a3 = new A3();
		a1.doIt(a3);
	}
	
}

class A3 {
	
	public void doIt() {
		
	}
	
}