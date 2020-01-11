package code9_1;

public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		scoreRecord.setDataSheetView(dataSheetView);
		scoreRecord.setMinMaxView(minMaxView);
		
		for(int idx=1; idx<=5; idx++) {
			int score = idx * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}
	}

}
