package before;

public class Client {

	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw();
		
		System.out.println();
		
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();
		
		System.out.println();
		
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
		roadWithTraffic.draw();
	}
	
}
