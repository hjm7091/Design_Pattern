package screen;

import map.Map;

public class SDScreen extends Screen {

	@Override
	public void drawMap(Map map) {
		System.out.println("Draw map " + map.getClass().getName() + " on SD screen");
	}

}
