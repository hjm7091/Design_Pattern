package before;

public class Computer {

	private Body body;
	private KeyBoard keyBoard;
	private Monitor monitor;
	
	public void addBody(Body body) {
		this.body = body;
	}
	
	public void addKeyBoard(KeyBoard keyBoard) {
		this.keyBoard = keyBoard;
	}
	
	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public int getPrice() {
		int bodyPrice = body.getPrice();
		int keyBoardPrice = keyBoard.getPrice();
		int monitorPrice = monitor.getPrice();
		return bodyPrice + keyBoardPrice + monitorPrice;
	}
	
	public int getPower() {
		int bodyPower = body.getPower();
		int keyBoardPower = keyBoard.getPower();
		int monitorPower = monitor.getPower();
		return bodyPower + keyBoardPower + monitorPower;
	}
}
