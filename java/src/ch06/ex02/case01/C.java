package ch06.ex02.case01;

public class C extends A{
	public void test() {
		int x = 0;
		// x = a; private는 상속받아도 안됨
		x = b;
		x = c;
		x = d;
		
		// m1();
		m2();
		m3();
		m4();
	}
}
