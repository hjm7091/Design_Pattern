package after;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("HyundaiMotor 구동시킴");
	}
	
}
