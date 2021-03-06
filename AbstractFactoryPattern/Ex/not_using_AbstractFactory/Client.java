package not_using_AbstractFactory;

import factory.BasicNaviFactory;
import factory.NaviFactory;
import gps.GPS;
import gps.Location;
import map.Map;
import path.PathFinder;
import screen.Screen;

public class Client {
	public static void main(String[] args) {
		NaviFactory factory = new BasicNaviFactory();
		
		GPS gps = factory.createGPS();
		Screen mapScreen = factory.createScreen();
		PathFinder pathFinder = factory.createPathFinder();
		
		Map map = factory.createMap();
		mapScreen.drawMap(map);
		
		Location l1 = gps.findCurrentLocation();
		Location l2 = gps.findCurrentLocation();
		
		pathFinder.findPath(l1, l2);
	}
}
