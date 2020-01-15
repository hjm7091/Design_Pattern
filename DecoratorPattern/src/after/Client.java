package after;

public class Client {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		
		System.out.println();
		
		Display roadWithLane = new LaneDecorator(road);
		roadWithLane.draw();
		
		System.out.println();
		
		Display roadWithTraffic = new TrafficDecorator(road);
		roadWithTraffic.draw();
	}
	
}
