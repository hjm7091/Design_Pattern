package factory;

import gps.GPS;
import gps.TestGPS;
import map.Map;
import map.TestMap;
import path.PathFinder;
import path.TestPathFinder;
import screen.Screen;
import screen.TestScreen;

public class TestNaviFactory extends NaviFactory{

	@Override
	public GPS createGPS() {
		return new TestGPS();
	}

	@Override
	public Screen createScreen() {
		return new TestScreen();
	}

	@Override
	public Map createMap() {
		return new TestMap();
	}

	@Override
	public PathFinder createPathFinder() {
		return new TestPathFinder();
	}

}
