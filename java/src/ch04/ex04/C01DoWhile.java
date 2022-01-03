package ch04.ex04;

import java.util.Scanner;
// 반복횟수가 0회 이상 - while
// 반복횟수가 1회 이상 - do while
public class C01DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //값을 최소 한번 이상 입력받아야하기 떄문에 do while이 적절하다.
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("숫자 1 입력 : ");
			a = sc. nextInt();
			System.out.print("숫자 2 입력 : ");
			b = sc. nextInt();
			result = a + b;
			System.out.printf("%d + %d = %d\n", a, b, result);
		}while(result !=0);
		
		System.out.println("합계가 0이 되어 끝");
		sc.close();
	}	

}
