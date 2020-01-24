package after;

public class KeyBoard extends ComputerDevice{

	private int price;
	private int power;
	
	public KeyBoard(int price, int power) {
		this.price = price;
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}
	
}
