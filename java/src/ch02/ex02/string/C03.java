package ch02.ex02.string;

public class C03 {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		// "우리 개는"이 StringBuffer의 메소드에 상수로 들어갔다.
		// String은 클래스임에도 불구하고 문법으로도 나타낼 수 있지만,
		// Scanner와 StringBuffer는 문법으로는 사용이 불가하기 때문에 new를 붙여서 위와같이 만든다.
		
		int len = src.length();
		System.out.println("length : " + len);
		
		src.append("짖는다."); 
		// 이 순간부터 더이상 메모리에 "우리 개는 "이라는 데이터는 없다.
		// "우리 개는 짖는다."와 "짖는다."만 존재한다.
		src.replace(3, 4, "고양이");
		// 이 순간부터 더이상 메모리에 "우리 개는 짖는다."는 없다.
		// "우리 고양이는 짖는다."와 "짖는다."와 "고양이"만 존재한다.
		
		System.out.printf("src : %s\n", src); // StringBuffer타입
		
		String str = src.toString();
		System.out.printf("str : %s", str); // String타입
		//데이터 타입이 다르면 서로 다른 값이다.

	}

}
