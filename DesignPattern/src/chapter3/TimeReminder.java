package chapter3;

public class TimeReminder {
	
	TimeProvider tProv;
	MP3 m = new MP3();
	
	public void setTimeProvider(TimeProvider tProv) {
		this.tProv = tProv;
	}
	
	public void reminder() {
		int hours = tProv.getTime();
		if(hours >= 22)
			m.playSong();
	}
	
	public static void main(String[] args) {
		TimeReminder sut = new TimeReminder();
		TimeProvider tProvStub = new FakeTimeProvider();
		tProvStub.setHours(22);
		sut.setTimeProvider(tProvStub);
		sut.reminder();
	}

}

class MP3 {
	public void playSong() {
		System.out.println("playSong!!");
	}
}
