package ex5;

public class Client {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(2, 1000);
		
		machine.insertMoney(1000);
		machine.pushButton();
		machine.insertMoney(1000);
		machine.insertMoney(500);
		machine.returnMoney();
	}

}
