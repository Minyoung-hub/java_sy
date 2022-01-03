package ch05.ex09.case01;

public class InitMain {
	public static void main(String[] args) {
		Init init = new Init();
		System.out.println();
		
		init = new Init();
		System.out.println();
		
		init = new Init("hello");
		// 생성자를 호출할때마다 인스턴스 초기화가 이루어지고있다.
		// 인스탄스 초기화와 ㅇㅇ의 공통점은 멤버변수 초기화하는 명령문을 갖고 있다는 것이다.
		// 차이점은 인스턴스 초기화 블럭은 늘 실행된는 반면, ㅇㅇ은 new로써 호출해야만 실행된다.
	}
}