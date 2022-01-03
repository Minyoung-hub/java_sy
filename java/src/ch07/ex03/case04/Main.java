package ch07.ex03.case04;

public class Main {
	public static void main(String[] args) {
		Human man = ()->System.out.println("안녕");
		// 위의 부분을 say메소드의 몸체로 판단한다.
		man.say();
	}
}