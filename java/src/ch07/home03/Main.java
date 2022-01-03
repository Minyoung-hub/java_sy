package ch07.home03;

import ch07.home03.dao.GradeDao;
import ch07.home03.dao.GradeDaoImpl;
import ch07.home03.service.GradeService;
import ch07.home03.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		GradeDao gradeDao = new GradeDaoImpl();
		GradeService gradeService = new GradeServiceImpl(gradeDao);
		
	}
}