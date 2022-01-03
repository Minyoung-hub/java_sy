package ch05.ex05.case02;

public class Arith {
	public double add(double a, double b) {
		return a + b;
	}
	
	public double add(int a, double b) {
		return a + b;
	}
	
	public double add(double a, int b) {
		return a + b;
	}
	//컴파일러는 이름뿐만 아니라 데이터 타입도 비교한다.
}
