package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		// Banana banana = new Banana();
		// 바나나 기본생성자는 존재하지 않기때문에 컴파일 에러가 뜬다.
		Banana banana = new Banana("델몬트");
		// 생성자는 new 연산자와 나란히 호출하면 된다.
	}
}