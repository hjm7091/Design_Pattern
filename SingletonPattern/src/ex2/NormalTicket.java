package ex2;

public class NormalTicket implements Ticket{

	private int serial_num;
	
	public NormalTicket(int num) {
		this.serial_num = num;
	}
	
	@Override
	public int getTicketNum() {
		return this.serial_num;
	}

}
