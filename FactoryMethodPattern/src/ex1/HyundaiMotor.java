package ex1;

public class HyundaiMotor extends Motor {

	private static HyundaiMotor instance;
	
	private HyundaiMotor() {
		
	}
	
	public static HyundaiMotor getInstance() {
		if(instance == null)
			instance = new HyundaiMotor();
		return instance;
	}
	
	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor " + direction);
	}
	
}
