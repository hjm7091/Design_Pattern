package ex2;

public class SCCDecorator extends CarOptionDecorator{

	private int sccPrice;
	
	public SCCDecorator(CarComponent decoratedCar, int sccPrice) {
		super(decoratedCar);
		this.sccPrice = sccPrice;
	}
	
	@Override
	public int getPrice() {
		int price = super.getPrice();
		return sccPrice + price;
	}
	
	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + " with Smart Cruise Control";
	}

}
