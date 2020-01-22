package unit_test_slowPathFinder;

import factory.BasicNaviFactory;
import factory.NaviFactory;
import factory.TestNaviFactory;
import gps.GPS;
import gps.Location;
import map.Map;
import path.PathFinder;
import screen.Screen;

public class Client {
	public static void main(String[] args) {
		NaviFactory basicNaviFactory = new BasicNaviFactory();
		NaviFactory testFactory = new TestNaviFactory();
		
		GPS gps = testFactory.createGPS();
		Screen mapScreen = testFactory.createScreen();
		PathFinder pathFinder = basicNaviFactory.createPathFinder();
		
		Map map = testFactory.createMap();
		mapScreen.drawMap(map);
		
		Location l1 = gps.findCurrentLocation();
		Location l2 = gps.findCurrentLocation();
		
		pathFinder.findPath(l1, l2);
	}
}
