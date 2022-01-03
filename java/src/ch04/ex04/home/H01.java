package ch04.ex04.home;

import java.util.Scanner;

public class H01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String oper = "";
		String cont = "";
		double result = 0;
		
		do {
			System.out.print("숫자 1 : ");
			num1 = sc.nextInt(); sc.nextLine();
			System.out.print("(+, -, *, /) : ");
			oper = sc.nextLine();
			System.out.print("숫자 2 : ");
			num2 = sc.nextInt(); sc.nextLine();
			
			switch(oper) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2;
			}
			
			System.out.printf("%d %s %d = %f\n", num1, oper, num2, result);
			System.out.print("계속 (y/n)? ");
			cont = sc.nextLine();
		}while(cont.equals("y"));
		
		System.out.println("끝");
		sc.close();
	}

}
