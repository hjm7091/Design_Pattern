package ex2;

public class LimpState extends CarState{

	public static final int LIMP_MODE_MAX_SPEED = 60;
	private static CarState state;
	
	private LimpState(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp(int targetSpeed) {
		System.out.print("Speed: " + car.getSpeed());
		if(targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED)
			car.setSpeed(targetSpeed);
		System.out.println(" ==> " + car.getSpeed());
	}

	@Override
	public void engineFailedDetected() {
		System.out.println("이미 림프 모드로 동작 중임");
	}

	@Override
	public void engineRepaired() {
		car.setState(car.getNormalMode());
	}
	
	public static CarState getInstance(Car car) {
		if(state == null)
			state = new LimpState(car);
		return state;
	}

}
