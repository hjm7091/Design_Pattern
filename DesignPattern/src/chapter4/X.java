package chapter4;

public class X {

	public static void main(String[] args) {
		Y y = new Y();
		y.m1(1, 2);
	}

}

class Y {
	
	public static final boolean g = true;
	
	public void m1(int a, int b) {
		System.out.println("m1 호출됨!!");
		Z o = new Z();
		if(g)
			o.m2();
	}
}

class Z {
	
	private W w;
	
	public void m2() {
		System.out.println("m2 호출됨!!");
		w = null;
	}
	
}

class W {
	
}
