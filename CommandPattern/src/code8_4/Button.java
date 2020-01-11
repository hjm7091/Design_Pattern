package code8_4;

public class Button {

	private Command command;
	
	public Button(Command command) {
		setCommand(command);
	}
	
	public void setCommand(Command newCommand) {
		this.command = newCommand;
	}
	
	public void pressed() {
		command.execute();
	}
	
}
