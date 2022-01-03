package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		System.out.println(2 > 1 && 2 > 1);
		System.out.println(2 < 1 && 2 > 1);
		System.out.println(2 < 1 || 2 > 1);
		System.out.println("");
		
		int a = 0, b = 0;
		System.out.println(++a < 0 && ++b < 0);
		System.out.printf("a : %d, b : %d\n", a, b);
		// ++b가 연산되지 않았기 때문에 b : 0 으로 나온다.
		// and연산자는 앞에 값이 False면 뒤에값은 계산하지않고 바로 False를 도출해낸다
		// 그래서 성능이 빨라질 수 있게 만든다.
		// &&이 아니라 &을 쓰면 앞의 값이 어떤 값이 나오든 두가지 다 계산을 한다. 비효율적이다.
		a = b = 0;
		System.out.println(++a > 0 || ++b < 0);
		System.out.printf("a : %d, b : %d", a, b);
		// ++b가 연산되지 않았기 때문에 b : 0 으로 나온다.
		// or연산자는 앞에 값이 True면 뒤에값은 계산하지않고 바로 True를 도출해낸다
	}

}
