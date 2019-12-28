package chapter2;

public class Person {

	private Role role;
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void doIt() {
		role.doIt();
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setRole(new Driver());
		p.doIt();
		p.setRole(new Worker());
		p.doIt();
	}

}

abstract class Role {
	public abstract void doIt();
}

class Driver extends Role {

	@Override
	public void doIt() {
		System.out.println("Driving");
	}
	
}

class Worker extends Role {

	@Override
	public void doIt() {
		System.out.println("Working");
	}
	
}
