package ch07.home;

import java.util.ArrayList;
import java.util.List;

public class GradeIo{
	Domain score = new Domain();
	public void play() {
		Console.info("학생별 점수 입력을 시작합니다.");
		List<Integer> scores = new ArrayList<>();
		int cnt = 1;
		
		do {
			Console.info(cnt + "번째 학생입니다.");
			scores.add(cnt);
		
			score.setKor(Console.inNum("국어 점수를 입력하세요."));
			score.setEng(Console.inNum("영어 점수를 입력하세요."));
			score.setMath(Console.inNum("수학 점수를 입력하세요."));
			
			scores.add(score.getKor());
			scores.add(score.getEng());
			scores.add(score.getMath());
			
			score.setSum(score.getKor() + score.getEng() + score.getMath());
			score.setAvg(score.getSum()/3);
			
			scores.add(score.getSum());
			scores.add(score.getAvg());
			cnt++;
			
		}while(Console.inChar("계속 입력하시겠습니까?(y/n)") == 'y');
		
		Console.info("점수 입력이 끝났습니다.");
		Console.info("   국어 영어 수학 합계  평균");
		Console.info("-----------------");
		
		for(int i=0; i<scores.size(); i++) {
			if(i%6==0 && i!=0) Console.info("");
			System.out.print(scores.get(i) + " ");
		}
		
		Console.info("\n-----------------");
	}
}