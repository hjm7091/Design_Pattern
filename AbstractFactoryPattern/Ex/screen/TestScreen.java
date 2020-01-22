package screen;

import map.Map;

public class TestScreen extends Screen{

	@Override
	public void drawMap(Map map) {
		System.out.println("Draw map " + map.getClass().getName() + " on Test screen");
	}

}
