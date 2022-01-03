package ch07.home02.dao;

import java.util.List;
import ch07.home02.domain.Score;

public interface GradeDao {
	void addScore(Score score);
	
	List<Score> getScores();
}