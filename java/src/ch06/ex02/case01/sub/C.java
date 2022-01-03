package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	public void test() {
		int x = 0;
		
		// x = a;
		// x = b;
		x = c;
		x = d;
		// protected는 같은 패키지에 있는 클래스들 사이에서 보이고
		// 다른 패키지더라도 상속받은 자식이면 보인다.
		// 이게 default랑 차이점이다.
		
		// 나만 써야지 프라이빗 
		// 다 공개해야지 퍼블릭
		// 자식만 쓰게 해야지 프로텍티드
		
		// m1();
		// m2();
		m3();
		m4();
	}
}