package chapter1;

public class Person {
	private Phone[] phones;
	private Phone homePhone;
	private Phone officePhone;
	private Car car;
	
	public Person() {
		phones = new Phone[2];
	}
	
	public Phone getPhone(int i) {
		if(i==0 || i==1)
			return phones[i]; //0�̸� �� ��ȭ, 1�̸� �繫�� ��ȭ 
		
		return null;
	}

	public Phone getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Phone homePhone) {
		this.homePhone = homePhone;
	}

	public Phone getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
