package code9_4;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{

	private List<Integer> scores = new ArrayList<Integer>();
	
	public void addScore(int score) {
		scores.add(score);
		notifyObservers();
	}

	public List<Integer> getScores() {
		return scores;
	}
}
