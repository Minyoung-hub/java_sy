package ch07.home02;

import ch07.home02.presentation.Console;
import ch07.home02.dao.GradeDao;
import ch07.home02.dao.GradeDaoImpl;
import ch07.home02.presentation.GradeIo;
import ch07.home02.service.GradeService;
import ch07.home02.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Console.info("성적 관리 앱을 시작합니다.");

		GradeDao gradeDao = new GradeDaoImpl();
		GradeService gradeService = new GradeServiceImpl(gradeDao);
		GradeIo gradeIo = new GradeIo(gradeService);
		
		gradeIo.play();
		
		Console.info("성적 관리 앱을 종료합니다.");
	}
}
/*di 디펜던시 인젝션
*/