package ch05.ex05.home03;

public class Ball {
	private int ball;

	public void setBall(int ball) {
		this.ball = ball;
	}
	
	public String toString() {
		return String.format("%d번 공", ball);
	}
}