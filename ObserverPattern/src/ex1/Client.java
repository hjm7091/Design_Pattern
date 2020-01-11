package ex1;

public class Client {

	public static void main(String[] args) {
		Battery battery = new Battery();
		Observer batteryLevelDisplay = new BatteryLevelDisplay(battery);
		Observer lowerBatteryWarning = new LowerBatteryWarning(battery);
		
		battery.attach(batteryLevelDisplay);
		battery.attach(lowerBatteryWarning);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
	}

}
