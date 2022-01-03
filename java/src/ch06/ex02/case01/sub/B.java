package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A test = new A();
		int x = 0;
		
		// x = test.a;
		// x = test.b;
		// x = test.c;
		x = test.d;
		// 접근 제한자가 public이여야만 다른 클래스에서도 사용이 가능하다.
		
		// test.m1();
		// test.m2();
		// test.m3();
		test.m4();
		
		// protected와 default는 같은 패키지 내에 있는 클래스에서는 
		// 접근 가능하지만 다른 패키지에 있는 클래스에서는 접근이 불가하다.
	}
}