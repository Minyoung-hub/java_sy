package ch03.ex03;

public class BitWise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
		x = ~x; // 이진수를 다 뒤집어줌 (1은 0으로, 0은 1로)
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
		x = x + 1;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
	}
}