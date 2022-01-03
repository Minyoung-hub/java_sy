package ch03.ex04.home;

import java.util.Scanner;

/*
 * 두 수를 입력 받아, 그 합계를 구하라
 * a : 1
 * b : 2
 * 1 + 2 = 3
 */
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요.\na : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		sc.close();
	}

}
