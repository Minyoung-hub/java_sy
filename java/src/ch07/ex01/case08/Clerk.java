package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName) {
		Flower flower = null;
		switch(flowerName) {
		case "백합": flower = new Lily(); break;
		case "장미": flower = new Rose();
		}
		return flower; 
	}
}
// 멤버변수 파라미터 리턴타입을 인터페이스로 놓으면 확장성을 확보할 수 있게된다.