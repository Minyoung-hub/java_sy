package ch07.home02.dao;

import java.util.ArrayList;
import java.util.List;
import ch07.home02.domain.Score;

public class GradeDaoImpl implements GradeDao{
	private List<Score> scores;
	
	public GradeDaoImpl() {
		this.scores = new ArrayList<>();
	}
	
	@Override
	public void addScore(Score score) {
		scores.add(score);
	}
	 
	public List<Score> getScores(){
		return this.scores;
	}
	
}