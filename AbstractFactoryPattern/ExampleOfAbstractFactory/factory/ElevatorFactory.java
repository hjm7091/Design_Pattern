package factory;

import door.Door;
import motor.Motor;

public abstract class ElevatorFactory {
	public abstract Motor createMotor();
	public abstract Door createDoor();
}
