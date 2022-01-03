package ch02.ex01;
// 패키지와 클래스 사이 이 자리는 빈칸으로 두는 것이 관례이다.
public class C01Variable {
	public static void main(String[] args) {
		//논리형
		boolean bl = false; 
		/* boolean은 1byte, bl변수를 선언했다. 선언된 변수에 값을 선정한 것을 초기화 했다고 한다.
		 * 메인 메소드 블럭 안에 변수를 선언할 때는 꼭 초기화를 하자!!(값을 안넣으면 쓰레기값이 들어가있다)
		 */
		//정수형
		byte b = 0; //각자 다른 데이터 타입을 갖고있다.
		short s = 0;
		char c = 0;
		int i = 0;
		long l = 0L; 
		/* L은 소문자로 써도 되는데 가독성이 떨어지기 때문에 대문자로 써준다. 
		 * L을 붙여줘야 변수의 크기도 64bit 상수의 크기도 64bit로 일치된다. 
		 * L안붙이면 상수는 32bit로 인식된다. int 타입의 0으로 생각한다. 즉, 데이터 크기를 맞춰주기 위해서 L을 붙인다.
		 */
		//실수형
		float f = 0.0f; //f를 붙이는 이유는 타입을 맞추기 위해서 이다. f를 안붙이면 상수가 64bit로 인식된다.(float는 32bit여야 한다)
		double d = 0.0; //double은 8byte
		
		String str = ""; //큰따옴표 안에 아무것도 안쓰는 것을 비문자열이라고 말한다. String의 기본값은 비문자열이다.
		
		int a;
		a = 0;
		int x,y;
		// int x=0, y=0;
		// 위 네개와 같이 쓸 수 있지만 가독성이 떨어지므로 이렇게 쓰지 않도록 한다.
	}

}
