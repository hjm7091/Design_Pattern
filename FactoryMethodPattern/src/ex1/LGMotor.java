package ex1;

public class LGMotor extends Motor{

	private static LGMotor instance;
	
	private LGMotor() {
		
	}
	
	public static LGMotor getInstance() {
		if(instance == null)
			instance = new LGMotor();
		return instance;
	}
	
	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("move LG Motor " + direction);
	}

}
