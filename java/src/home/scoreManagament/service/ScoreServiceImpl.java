package home.scoreManagament.service;

import home.scoreManagament.dao.ScoreDao;
import home.scoreManagament.domain.Score;

public class ScoreServiceImpl implements ScoreService{
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public Score setScore() {
		Score score = null;
		return score;
	}
}