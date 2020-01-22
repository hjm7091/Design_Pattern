package factory;

import gps.ExpensiveGPS;
import gps.GPS;
import map.LargeMap;
import map.Map;
import path.FastPathFinder;
import path.PathFinder;
import screen.HDScreen;
import screen.Screen;

public class PremiumNaviFactory extends NaviFactory{

	@Override
	public GPS createGPS() {
		return new ExpensiveGPS();
	}

	@Override
	public Screen createScreen() {
		return new HDScreen();
	}

	@Override
	public Map createMap() {
		return new LargeMap();
	}

	@Override
	public PathFinder createPathFinder() {
		return new FastPathFinder();
	}

}
