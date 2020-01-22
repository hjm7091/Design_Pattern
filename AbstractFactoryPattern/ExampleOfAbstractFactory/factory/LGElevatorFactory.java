package factory;

import door.Door;
import door.LGDoor;
import motor.LGMotor;
import motor.Motor;

public class LGElevatorFactory extends ElevatorFactory{

	private Motor motor;
	private Door door;
	
	@Override
	public Motor createMotor() {
		if(motor == null)
			motor = new LGMotor();
		return motor;
	}

	@Override
	public Door createDoor() {
		if(door == null)
			door = new LGDoor();
		return door;
	}

}
