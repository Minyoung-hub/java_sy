package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		System.out.println('A' < 'B');
		System.out.println('0'== 0);
		System.out.println('A'!= 65);
		System.out.println();
		
		System.out.println(10.0 == 10.0f);
		System.out.println(0.1 == 0.1f);
		System.out.println((float)0.1 == 0.1f);
		// 비교연산자의 조건문은  boolean type으로 return된다.
		
	}
}
