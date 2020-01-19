package ex2;

public class NormalState extends CarState{

	private static CarState state;
	
	private NormalState(Car car) {
		super(car);
	}
	
	@Override
	public void speedUp(int targetSpeed) {
		System.out.print("Speed: " + car.getSpeed());
		if(targetSpeed > car.getSpeed())
			car.setSpeed(targetSpeed);
		System.out.println(" ==> " + car.getSpeed());
	}

	@Override
	public void engineFailedDetected() {
		System.out.print("Speed: " + car.getSpeed());
		car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
		System.out.println(" ==> " + car.getSpeed());
		car.setState(car.getLimpMode());
	}

	@Override
	public void engineRepaired() {
		System.out.println("이미 노말 모드로 동작 중임");
	}
	
	public static CarState getInstance(Car car) {
		if(state == null)
			state = new NormalState(car);
		return state;
	}
}
