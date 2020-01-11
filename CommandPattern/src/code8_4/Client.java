package code8_4;

public class Client {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);
		
		Button button = new Button(lampOnCommand);
		button.pressed();
		
		button.setCommand(alarmOnCommand);
		button.pressed();
	}

}
