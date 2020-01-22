package factory;

import gps.GPS;
import map.Map;
import path.PathFinder;
import screen.Screen;

public abstract class NaviFactory {
	public abstract GPS createGPS();
	public abstract Screen createScreen();
	public abstract Map createMap();
	public abstract PathFinder createPathFinder();
}
