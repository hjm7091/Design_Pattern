package code9_1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	
	private List<Integer> scores = new ArrayList<Integer>();
	private DataSheetView dataSheetView;
	private MinMaxView minMaxView;
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void addScore(int score) {
		scores.add(score);
		dataSheetView.update();
		minMaxView.update();
	}

	public List<Integer> getScores() {
		return scores;
	}
	
}
