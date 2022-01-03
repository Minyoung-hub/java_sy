package ch07.ex01.case07;

public class Human {
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}
	// 파라미터의 데이터 타입은 인터페이스를 쓰는 것이 좋다.
	// 확장성이 좋기 때문이다.
}