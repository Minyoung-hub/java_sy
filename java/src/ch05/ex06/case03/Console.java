package ch05.ex06.case03;

import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	public static String inStr() {
		return sc.nextLine().trim();
		// trim이라는 메소드를 넣어주면 빈칸문자를 제거해준다.(머리부분 꼬리부분에 있는 것만)
	}
	
	public static int inNum() {
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void inMsg(String msg){
		System.out.print(msg + "\n> ");
	}
}