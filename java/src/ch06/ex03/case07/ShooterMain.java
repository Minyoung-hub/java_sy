package ch06.ex03.case07;

public class ShooterMain {
	public static void main(String[] args) {
		Shooter shooter = new Shooter(new Gun());
		shooter.fire();
	}
}