package ch07.home02.service;

import java.util.List;
import ch07.home02.domain.Score;

public interface GradeService {
	void writeScore(Score score);
	
	List<Score> listScores();
}