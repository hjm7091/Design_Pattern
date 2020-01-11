package ex3;

public class ElevatorButton {

	private Command command;
	
	public ElevatorButton(Command command) {
		this.command = command;
	}
	
	public void pressed() {
		command.execute();
	}
	
}
