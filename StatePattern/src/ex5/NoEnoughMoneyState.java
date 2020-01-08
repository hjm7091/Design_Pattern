package ex5;

public class NoEnoughMoneyState implements State{

	private VendingMachine machine;
	
	public NoEnoughMoneyState(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney(int money) {
		machine.getMoneyBox().insert(money);
		System.out.println(money + "원을 넣었습니다.");
		
		if(machine.getMoneyBox().getMoney() >= machine.getDrinking().getPrice()) {
			machine.setState(machine.getEnoughMoneyState());
		}
		System.out.println("현재 금액은 " + machine.getMoneyBox().getMoney() + "원입니다.");
	}

	@Override
	public void pushButton(int price) {
		System.out.println("돈이 부족합니다.");
	}

	@Override
	public void returnMoney() {
		int tmp = machine.getMoneyBox().returnMoney();
		System.out.println(tmp + "원이 반환되었습니다.");
		machine.setState(machine.getNoMoneyState());
	}

}
