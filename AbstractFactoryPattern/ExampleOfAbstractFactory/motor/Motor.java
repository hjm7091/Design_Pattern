package motor;

import direction.Direction;
import door.Door;
import door.DoorStatus;

public abstract class Motor {

	protected Door door;
	private MotorStatus motorStatus;
	
	public Motor() {
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED)
			door.close();
		
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
	
	public void setDoor(Door door) {
		this.door = door;
	}
	
}
