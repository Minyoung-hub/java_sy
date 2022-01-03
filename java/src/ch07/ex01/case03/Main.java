package ch07.ex01.case03;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		C c = d;
		B b = d;
		A a = d;
		// 자식타입에서 부모타입으로는 프로모션된다.
		
		// d = a;
		// d = b;
		// d = c;
		// 부모타입에서 자식타입으로는 강제 형변환(프로모션)이 되지 않는다.
		
		d = (D)a;
		d = (D)b;
		d = (D)c;
	}
}