package home.scoreManagament.dao;

import home.scoreManagament.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	public Score getStudentNum() {
		return new Score();
	}
}