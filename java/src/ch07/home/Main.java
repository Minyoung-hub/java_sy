package ch07.home;

public class Main {
	public static void main(String[] args) {
		GradeIo gradeIo = new GradeIo();
		Console.info("성적관리 앱을 시작합니다.");
		gradeIo.play();
		Console.info("성적 관리 앱을 종료합니다.");
	}

}
