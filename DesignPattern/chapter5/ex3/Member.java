package ex3;

public class Member {
	
	private String name;
	private int accPrice;
	
	public Member(String name) {
		this.name = name;
		accPrice = 0;
	}

	public String getName() {
		return name;
	}

	public int getAccPrice() {
		return accPrice;
	}
	
	public void addAccPrice(int price) {
		accPrice += price;
	}
}
