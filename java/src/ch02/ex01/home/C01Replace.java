package ch02.ex01.home;
/*
 * 두 변수의 값을 교체하라
 * a:1, b:2 고정된 상태에서(hard coding)
 * a:2, b:1로 교체
 */
public class C01Replace {
	public static void main(String[] args) {
		int a = 1 ;
		int b = 2 ;
		System.out.printf("a : %d, b : %d\n", a, b);
		int c = 0;
		c = a ;
		a = b ;
		b = c ;
		System.out.printf("a : %d, b : %d", a, b);
	}

}