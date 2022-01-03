package home.scoreManagament;

import home.scoreManagament.dao.ScoreDao;
import home.scoreManagament.dao.ScoreDaoImpl;
import home.scoreManagament.presentation.Console;
import home.scoreManagament.presentation.ScoreIo;
import home.scoreManagament.service.ScoreService;
import home.scoreManagament.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl();
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		Console.info("성적 관리 앱을 시작합니다.\n");
		scoreIo.play();
		Console.info("성적관리 앱을 종료합니다.");

	}

}
