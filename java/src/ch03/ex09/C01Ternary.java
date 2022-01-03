package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 0;
		int y = -10;
		
		int absX = (x >= 0) ? x : -x; // 절댓값 출력하는 식
		// 물음표 앞에는 조건문을 써주고, 물음표 뒤에는 두개의 값을 나열한다. (조건문) ? 값 : 값
		// x값이 0 이상이라면 x의 값을 그대로 리턴하고, 그렇지 않다면 -x로 리턴하라는 의미이다.
		// 이를 삼항연산자라고 한다
		int absY = (y >= 0) ? y : -y;
		System.out.println(absX);
		System.out.println(absY);
	}

}
