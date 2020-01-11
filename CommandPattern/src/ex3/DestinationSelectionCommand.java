package ex3;

public class DestinationSelectionCommand implements Command{

	private int destination;
	private ElevatorController elevatorController;
	
	public DestinationSelectionCommand(int destination, ElevatorController elevatorController) {
		this.destination = destination;
		this.elevatorController = elevatorController;
	}
	
	@Override
	public void execute() {
		elevatorController.gotoFloor(destination);
	}

}
