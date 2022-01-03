package ch07.home03.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	public static int inNum(String msg) {
		System.out.println(msg + "\n>> ");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static char inChar(String msg) {
		System.out.println(msg + "\n>> ");
		return sc.nextLine().charAt(0);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}