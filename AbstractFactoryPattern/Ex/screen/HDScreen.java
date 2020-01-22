package screen;

import map.Map;

public class HDScreen extends Screen {

	@Override
	public void drawMap(Map map) {
		System.out.println("Draw map " + map.getClass().getName() + " on HD screen");
	}

}
