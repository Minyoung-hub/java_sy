package home.scoreManagament.presentation;

import home.scoreManagament.domain.Score;
import home.scoreManagament.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		Score score = new Score();
		
		int studentNum = Console.inNum("학생수를 입력하세요.");
		int[][] grade = new int[studentNum][5];
		Console.info("학생별 점수 입력을 시작합니다.\n");
		
		for(int i=0; i<studentNum; i++) {
			Console.info(i+1+"번째 학생입니다.\n");
			
			for(int j = 0; j<grade[i].length; j++) {
				switch(j) {
				case 0: 
					score.setKor(Console.inNum("국어 점수를 입력하세요.")); 
					grade[i][j] = score.getKor();
					break;
				case 1: 
					score.setEng(Console.inNum("영어 점수를 입력하세요.")); 
					grade[i][j] = score.getEng();
					break;
				case 2: 
					score.setMath(Console.inNum("수학 점수를 입력하세요.")); 
					grade[i][j] = score.getMath();
					break;
				case 3: 
					score.setSum(score.getKor()+score.getEng()+score.getMath());
					grade[i][j] = score.getSum();
					break;
				case 4:
					score.setAvg(score.getSum() / 3);
					grade[i][j] = score.getAvg();
				}
			}
		}
		Console.info("점수 입력이 끝났습니다.\n");
		Console.info("번호 국어 영어 수학  합계  평균\n");
		Console.info("===================\n");
		
		for(int i=0; i<studentNum; i++) {
			System.out.printf(" %d ", i+1);
			
			for(int j=0; j<grade[i].length; j++) {
				Console.info(grade[i][j] + " ");
			}
			Console.info("\n");
		}
		Console.info("===================\n");
	}
}