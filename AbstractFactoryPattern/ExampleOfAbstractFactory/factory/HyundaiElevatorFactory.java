package factory;

import door.Door;
import door.HyundaiDoor;
import motor.HyundaiMotor;
import motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory{

	private Motor motor;
	private Door door;
	
	@Override
	public Motor createMotor() {
		if(motor == null)
			motor = new HyundaiMotor();
		return motor;
	}

	@Override
	public Door createDoor() {
		if(door == null)
			door = new HyundaiDoor();
		return door;
	}

}
