package ch05.ex05.home01;

public class Dice {
	private int number;
	
	public int getNumber() {
		return (int)(Math.random() * 6) + 1;
	}
}