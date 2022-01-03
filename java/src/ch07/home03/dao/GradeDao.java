package ch07.home03.dao;

import java.util.List;
import ch07.home03.domain.Score;

public interface GradeDao {
	void addScore(Score score);
	
	List<Score> getScores();
}