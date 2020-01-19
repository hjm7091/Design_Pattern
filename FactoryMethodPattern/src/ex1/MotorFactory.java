package ex1;

public class MotorFactory {

	public static Motor getMotor(MotorVendorID venforID) {
		Motor motor = null;
		switch (venforID) {
			case LG:
				motor = LGMotor.getInstance();
				break;
			case HYUNDAI:
				motor = HyundaiMotor.getInstance();
				break;
		}
		return motor;
	}
	
}
