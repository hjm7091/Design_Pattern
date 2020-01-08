package ex5;

public class SoldOutState implements State{

	private VendingMachine machine;
	
	public SoldOutState(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney(int money) {
		System.out.println("재고가 없습니다.");
	}

	@Override
	public void pushButton(int price) {
		
	}

	@Override
	public void returnMoney() {
		int tmp = machine.getMoneyBox().returnMoney();
		System.out.println(tmp + "원이 반환되었습니다.");
		machine.setState(machine.getNoMoneyState());
	}

}
