package ex2;

public class BasicCar extends CarComponent{

	private int price;
	
	public BasicCar(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getCarInfo() {
		return "Car";
	}

}
