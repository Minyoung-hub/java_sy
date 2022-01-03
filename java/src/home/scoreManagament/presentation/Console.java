package home.scoreManagament.presentation;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public static int inNum(String msg) {
		inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>> ");
	}
	
	public static void info(String msg) {
		System.out.print(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}