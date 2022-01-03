package ch05.ex05.case19;

public class ManMain {
	public static void main(String[] args) {
		Man man = new Man();
		man.eat(new Banana());
		man.eat(new Grape());
		// 메소드 오버로딩의 장점은 코드가 투명해진다는 것이다.
	}
}