package client;

import direction.Direction;
import door.Door;
import factory.ElevatorFactory;
import factory.HyundaiElevatorFactory;
import factory.LGElevatorFactory;
import motor.Motor;

public class Client {

	public static void main(String[] args) {
		ElevatorFactory factory = null;
		String vendorName = "Hyundai";
		if(vendorName.equalsIgnoreCase("LG"))
			factory = new LGElevatorFactory();
		else
			factory = new HyundaiElevatorFactory();
		
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
	}
	
}
