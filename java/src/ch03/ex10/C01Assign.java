package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i += 2); // i = i + 2의 줄임말(복합 할당연산자) 결과값 5
		System.out.println(i -= 2); // i = i - 2 결과값 3
		System.out.println(i *= 2); // i = i * 2 결과값 6
		System.out.println(i /= 2); // i = i / 2 결과값 3
		System.out.println(i %= 2); // i = i % 2 결과값 1
	}

}
