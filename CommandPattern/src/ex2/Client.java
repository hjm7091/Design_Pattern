package ex2;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		TwoButtonController rc = new TwoButtonController();
		Command powerCommand = new PowerCommand(tv);
		
		rc.setCommand(powerCommand, powerCommand);
		
		rc.button1Pressed();
		rc.button2Pressed();
		
		rc.button1Pressed();
		rc.button1Pressed();
		
		rc.button2Pressed();
		rc.button1Pressed();
		
		System.out.println("----------------");
		
		Command muteCommand = new MuteCommand(tv);
		
		rc.setCommand(muteCommand, powerCommand);
		
		rc.button1Pressed();
		rc.button2Pressed();
		
		rc.button1Pressed();
		rc.button1Pressed();
		
		rc.button2Pressed();
		rc.button1Pressed();
	}
}
