package ch04.ex02;

public class C06RandomVal {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10); // 0 ~ 9
		int b = (int)(Math.random() * 10) + 1; // 1 ~ 10
		int c = (int)(Math.random() * 13) + 5; // 5 ~ 17
		int d = (int)(Math.random() * 3) + 1; // 1 ~ 3
	}

}
