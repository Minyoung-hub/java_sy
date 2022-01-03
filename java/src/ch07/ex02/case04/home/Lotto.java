package ch07.ex02.case04.home;

public class Lotto {
	public static void main(String[] args) {
		int[] number = new int[6];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random() * 45) + 1;
			System.out.print(number[i] + " ");
		}
	}
}