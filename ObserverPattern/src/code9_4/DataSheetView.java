package code9_4;

import java.util.List;

public class DataSheetView implements Observer{
	
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update() {
		List<Integer> record = scoreRecord.getScores();
		displayScores(record, viewCount);
	}
	
	public void displayScores(List<Integer> record, int viewCount) {
		System.out.println("List of " + viewCount + " enties: ");
		for(int i=0; i<viewCount && i<record.size(); i++) {
			System.out.print(record.get(i) + " ");
		}
		System.out.println();
	}
}
