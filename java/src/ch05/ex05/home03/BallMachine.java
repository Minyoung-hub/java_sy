package ch05.ex05.home03;

public class BallMachine {
	public Ball pull() {
		Ball lotto = new Ball();
		lotto.setBall((int)(Math.random() * 45) + 1);
		return lotto;
	}
}