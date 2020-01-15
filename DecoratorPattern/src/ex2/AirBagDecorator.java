package ex2;

public class AirBagDecorator extends CarOptionDecorator{

	private int airBagPrice;
	
	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice;
	}

	@Override
	public int getPrice() {
		int price = super.getPrice();
		return airBagPrice + price;
	}
	
	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + " with Air Bag";
	}
	
}
