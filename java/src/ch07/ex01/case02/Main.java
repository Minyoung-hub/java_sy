package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c; // 부모타입으로의 전환 -> 프로모션으로도 가능
		A a = c;
		// c = a;
		c = (C)a; // 자식타입으로의 전환 -> 캐스팅으로 가능
		b = (B)a;
		
		c = (C)b;
	}
}