package ch07.home02.service;

import java.util.List;
import ch07.home02.dao.GradeDao;
import ch07.home02.domain.Score;

public class GradeServiceImpl implements GradeService{
	private GradeDao gradeDao;
	
	public GradeServiceImpl(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}
	
	@Override
	public void writeScore(Score score) {
		this.gradeDao.addScore(score);
	}
	
	@Override
	public List<Score> listScores() {
		List<Score> scores = this.gradeDao.getScores();
		
		int sum = 0;
		int avg = 0;
		for(Score score:scores) {
			sum = score.getKor() + score.getEng() + score.getMath();
			avg = sum/3;
			score.setSum(sum);
			score.setAvg(avg);
		}
		return scores;
	}
}