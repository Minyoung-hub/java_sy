package ch07.home03.service;

import java.util.List;
import ch07.home03.domain.Score;

public interface GradeService {
	void writeScore(Score score);
	
	List<Score> listScores();
}