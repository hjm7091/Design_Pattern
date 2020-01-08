package after;

public class SLEEPING implements State{

	private static SLEEPING sleeping = new SLEEPING();
	
	private SLEEPING() {
		
	}
	
	public static SLEEPING getInstance() {
		return sleeping;
	}
	
	@Override
	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On Back!!");
	}

	@Override
	public void off_button_pushed(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light Off Back!!");
	}

}
