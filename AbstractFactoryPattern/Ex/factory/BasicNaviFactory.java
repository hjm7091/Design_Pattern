package factory;

import gps.CheapGPS;
import gps.GPS;
import map.Map;
import map.SmallMap;
import path.PathFinder;
import path.SlowPathFinder;
import screen.SDScreen;
import screen.Screen;

public class BasicNaviFactory extends NaviFactory{

	@Override
	public GPS createGPS() {
		return new CheapGPS();
	}

	@Override
	public Screen createScreen() {
		return new SDScreen();
	}

	@Override
	public Map createMap() {
		return new SmallMap();
	}

	@Override
	public PathFinder createPathFinder() {
		return new SlowPathFinder();
	}

}
