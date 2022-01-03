package ch02.ex01.home;

import java.util.Scanner;

/*
 * 두 변수의 값을 교체하라
 * a, b를 입력받은 상태에서(soft coding, 과제1번에서 리팩토링하라)
 * 값을 교체
 */
public class C02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 값을 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("b 값을 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.printf("입력한 값은 a : %d, b : %d\n", a, b);
		int c = 0;
		c = a ;
		a = b ;
		b = c ;
		System.out.printf("바뀐 값은 a : %d, b : %d", a, b);
	}

}