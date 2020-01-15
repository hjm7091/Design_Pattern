package ex2;

public class NaviDecorator extends CarOptionDecorator{

	private int naviPrice;
	
	public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
		super(decoratedCar);
		this.naviPrice = naviPrice;
	}
	
	@Override
	public int getPrice() {
		int price = super.getPrice();
		return naviPrice + price;
	}
	
	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + " with Navigation";
	}

}
