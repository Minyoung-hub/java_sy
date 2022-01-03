package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; // final은 대문자로 써놓는다. 그리고 final keyword는 MAX변수를 상수로 바꿔준다. MAX값을 더 이상 바꿀 수 없다.
		// MAX = 10; -> 오류뜸, 가독성을 좋게 만들기 위해서 쓴다.
		// final을 붙여서 값을 선언하면 그게 마지막 값이 된다.
		
		final double PI = 3.14;
		double area = PI * 3 * 3; // 원의 넓이
	}

}
