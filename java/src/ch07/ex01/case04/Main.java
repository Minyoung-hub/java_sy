package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Platanus(); //프로모션 Platanus타입이  Tree타입으로
		Platanus platanus = new Platanus();
		
		platanus = (Platanus)tree;
		tree = platanus;
		tree = (Tree)platanus;
		// 부모 타입에서 자식 타입으로 갈때는 캐스팅
		// 자식 타입에서 부모 타입으로 갈때는 캐스팅, 프로모션 모두 가능.
	}
}