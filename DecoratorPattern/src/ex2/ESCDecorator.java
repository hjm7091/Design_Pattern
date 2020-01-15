package ex2;

public class ESCDecorator extends CarOptionDecorator{

	private int escPrice;
	
	public ESCDecorator(CarComponent decoratedCar, int escPrice) {
		super(decoratedCar);
		this.escPrice = escPrice;
	}
	
	@Override
	public int getPrice() {
		int price = super.getPrice();
		return escPrice + price;
	}
	
	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + " with Electronic Stability Control";
	}

}
