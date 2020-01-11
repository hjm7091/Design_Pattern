package ex3;

import java.util.ArrayList;

public class ElevatorManager {

	private ArrayList<ElevatorController> controllers;
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
	}
	
	public void addController(ElevatorController elevatorController) {
		controllers.add(elevatorController);
	}
	
	public void requestElevator(int destination, Direction direction) {
		int selectedElevator = selectElevator(destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
	
	private int selectElevator(int destination, Direction direction) {
		return 0;
	}
}
