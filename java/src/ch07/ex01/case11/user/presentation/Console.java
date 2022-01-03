package ch07.ex01.case11.user.presentation;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public static String inStr(String msg) {
		inMsg(msg);
		return sc.nextLine().trim();
	}
	
	public static int inNum(String msg) {
		inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}
